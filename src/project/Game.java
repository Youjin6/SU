package project;

/**
 * @Author jiangfq
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author jiangfq
 */
public class Game {
   private static int players = 10;
   private static int[][] me = new int[players][players];
   private static List<Ladder> ladders = new ArrayList<Ladder>(4);
   private static List<Snake> snakes = new ArrayList<Snake>(4);
   private static int[][] datas = new int[5][5];
   private static AtomicBoolean ab = new AtomicBoolean(false);
   private static AtomicInteger ai = new AtomicInteger(-1);

   /**
    * @Author jiangfq
    */
   public static void main(String[] args) {
      init();
      for (int i = 0; i < players; i++) {
         new GameThread(datas, snakes, ladders, me, i, ab, ai).start();
         ;
      }
      while (!ab.get()) {
      }
      System.out.println(ai.get() + "玩家胜利了--------------------------------------------------！");
   }


   private static void init() {
      for (int i = 0; i < players; i++) {
         me[i][i] = 1;
      }
      Random random = new Random();

      int count = 1;
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            datas[i][j] = count++;
         }
      }

      for (int i = 0; i < 4; i++) {
         int[][] ladderHeader = new int[1][1];
         int[][] ladderTail = new int[1][1];
         int hx = random.nextInt(5);
         while (hx == 0) {
            hx = random.nextInt(5);
         }
         int hy = random.nextInt(5);

         int tx = random.nextInt(5);
         while (tx >= hx) {
            tx = random.nextInt(5);
         }
         int ty = random.nextInt(5);

         ladderHeader[0][0] = datas[hx][hy];
         ladderTail[0][0] = datas[tx][ty];

         Ladder ladder = new Ladder(ladderHeader, ladderTail);
         ladders.add(ladder);
      }

      for (int i = 0; i < 4; i++) {
         int[][] snakeHeader = new int[1][1];
         int[][] snakeTail = new int[1][1];
         int hx = random.nextInt(5);
         while (hx == 0) {
            hx = random.nextInt(5);
         }
         int hy = random.nextInt(5);

         int tx = random.nextInt(5);
         while (tx >= hx) {
            tx = random.nextInt(5);
         }
         int ty = random.nextInt(5);
         snakeHeader[0][0] = datas[hx][hy];
         snakeTail[0][0] = datas[tx][ty];
         Snake snake = new Snake(snakeHeader, snakeTail);
         snakes.add(snake);
      }

   }


}


class Ladder {
   private int[][] header;
   private int[][] tail;

   public Ladder(int[][] header, int[][] tail) {
      this.header = header;
      this.tail = tail;
   }

   public int[][] getHeader() {
      return header;
   }

   public void setHeader(int[][] header) {
      this.header = header;
   }

   public int[][] getTail() {
      return tail;
   }

   public void setTail(int[][] tail) {
      this.tail = tail;
   }


}


class Snake {
   private int[][] header;
   private int[][] tail;

   public Snake(int[][] header, int[][] tail) {
      this.header = header;
      this.tail = tail;
   }

   public int[][] getHeader() {
      return header;
   }

   public void setHeader(int[][] header) {
      this.header = header;
   }

   public int[][] getTail() {
      return tail;
   }

   public void setTail(int[][] tail) {
      this.tail = tail;
   }
}


class GameThread extends Thread {
   private int[][] datas;
   private List<Snake> snakes;
   private List<Ladder> ladders;
   private int[][] me;
   private int p;
   private AtomicBoolean ab;
   private AtomicInteger ai;

   public GameThread(int[][] datas, List<Snake> snakes, List<Ladder> ladders, int[][] me, int p, AtomicBoolean ab, AtomicInteger ai) {
      this.datas = datas;
      this.snakes = snakes;
      this.ladders = ladders;
      this.me = me;
      this.p = p;
      this.ab = ab;
      this.ai = ai;
   }

   @Override
   public void run() {
      startGame();
   }

   private void startGame() {
      Random random = new Random();
      boolean flag = false;
      while (!flag && !ab.get()) {
         int x = random.nextInt(7);
         while (x == 0) {
            x = random.nextInt(7);
         }
         System.out.println(p + "玩家，你可以跳：" + x + "步! 现在在" + me[p][p] + "  即将去" + (x + me[p][p]));
         int t = x + me[p][p];
         for (int i = 0; i < datas.length; i++) {
            boolean isRun = false;
            if (ab.get()) {
               flag = true;
               break;
            }
            for (int j = 0; j < datas[i].length; j++) {
               if (t >= 25) {
                  ab.set(true);
                  ai.set(p);
                  flag = true;
                  break;
               }
               if (ab.get()) {
                  flag = true;
                  break;
               }
               if (datas[i][j] == t) {
                  for (Snake snake : snakes) {
                     int[][] headers = snake.getHeader();
                     if (headers[0][0] == t) {
                        int[][] tails = snake.getTail();
                        System.out.println(p + "玩家走" + x + "步太背了，遇到蛇头了：" + t + " 我要滑到蛇尾：" + tails[0][0]);
                        me[p][p] = tails[0][0];
                        isRun = true;
                        break;
                     }
                  }
                  if (ab.get()) {
                     flag = true;
                     break;
                  }
                  for (Ladder ladder : ladders) {
                     int[][] tails = ladder.getTail();
                     if (tails[0][0] == t) {
                        int[][] headers = ladder.getHeader();
                        System.out.println(p + "玩家走" + x + "步太好了，遇到梯子了：" + t + " 我要爬上去了：" + headers[0][0]);
                        me[p][p] = headers[0][0];
                        isRun = true;
                        break;
                     }
                  }
                  if (ab.get()) {
                     flag = true;
                     break;
                  }
                  if (!isRun) {
                     me[0][0] = t;
                     break;
                  }
               }
            }
            if (flag || isRun) {
               break;
            }
         }
         if (flag) {
            break;
         }
      }

   }
}