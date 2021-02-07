package midterm;

import java.util.Scanner;

public class PrettyFords {
   public static void main(String[] args) {
      int number;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");

      number = keyboard.nextInt();

      // pattern1
      System.out.println("1. X copies of X on one line.");
      for (int i = 0; i < number; i++) {
         System.out.print(number);
      }
      System.out.println("\n\n");

      // pattern2
      System.out.println("2. X lines with a single 1 on each line.");
      for (int i = 0; i < number; i++) {
         System.out.println("1");
      }
      System.out.println("\n");


      // pattern3

      System.out.println("3. Multiplication table to X.");
      System.out.println();
      final int FOUR = 4;

      for (int i = 0; i < FOUR; i++) {
         System.out.print(" ");
      }
      for (int i = 1; i <= number; i++) {
         System.out.printf("%4d", i);
      }
      System.out.println();
      for (int i = 1; i <= number; i++) {
         System.out.printf("%4d",i);
         for (int j = 1; j <= number; j++) {
            System.out.printf("%4d",i * j);

         }
         System.out.println();
      }
   }


}
