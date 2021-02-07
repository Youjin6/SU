package Material.wk2_wed;

import java.util.Scanner;

/**
 * @author youjin
 */
public class _SoccerPoints {
    public static void main(String[] args) {
        int points = 0;
        int totalPoints = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the points, Enter -1 when finished");
        System.out.println();

        /* !!!!!!! BUG1: !!!!!!!!!
         * 进入 while 之前要先收取一次输入, 判断是不是 -1
         * 进入 while 之后要先更新一次 total point,
         *   1. 在第一次进入的时候, 累加第一次的输入
         *   2. while 循环内部, 若 points 得到了-1, 就跳出了循环, 不往 total 上面添加.
         *  */
        System.out.print("Enter game points or -1 to end: ");
        points = keyboard.nextInt();

        while (points != -1) {
            totalPoints += points;
            System.out.print("Enter game points or -1 to end: ");
            points = keyboard.nextInt();

        }

        System.out.printf("Your total points are: %d\n",totalPoints);


    }

}
