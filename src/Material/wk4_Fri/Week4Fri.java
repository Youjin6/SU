package Material.wk4_Fri;

import java.util.Scanner;

public class Week4Fri {
   public static void main(String[] args) {
      int size;
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter size: ");
      size = keyboard.nextInt();

      int[][] array = new int[size][size];

      for (int row = 0; row < size; row++) {
         for (int column = 0; column < size; column++) {
            array[row][column] = (row + 1) * (column + 1);
            System.out.printf("%2d ", array[row][column]);
         }
         System.out.println();
      }

   }
}
