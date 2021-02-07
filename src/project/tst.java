package project;

import java.util.Random;

public class tst {
   public static void main(String[] args) {
      Random random = new Random();
      int h;
      int n = 0;
      while (n < 99999) {
         for (int i = 0; i < 5; i++) {
            h = random.nextInt(100);
            System.out.println(h);
            if (h == 5){
               System.out.println("haha");
               return;
            }
         }
      }
   }
}
