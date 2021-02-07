package Material.wk4_Fri;

import java.util.Scanner;

public class CorpSales {
   public static void main(String[] args) {
      final int DIVS = 3;
      final int QTRS = 4;
      double totalSales = 0.0;

      // creat an array to hold the sales for each division, for each quarter.
      double[][] sales = new double[DIVS][QTRS];

      // Scanner
      Scanner keyboard = new Scanner(System.in);

      // 接受每个位置的输入
      for (int i = 0; i < DIVS; i++) {
         for (int j = 0; j < QTRS; j++) {
            System.out.printf("Division %d, Quarter %d: ", (i + 1),
                  (j + 1));
            sales[i][j] = keyboard.nextDouble(); // bug1: 这里不能是 sales[DIV][QTS]
         }
         System.out.println();
      }

      // 打印
      for (int i = 0; i < DIVS; i++) {
         for (int j = 0; j < QTRS; j++) {
            totalSales += sales[i][j];
            System.out.println(sales[i][j]);
         }
         System.out.println();
      }
   }
}
