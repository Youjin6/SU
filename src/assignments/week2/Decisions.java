package assignments.week2;

import java.util.Scanner;

/**
 * This program prompts user for two integers
 * and display if the first integer is a multiple of
 * the second integer on to the standard output.
 *
 * @author youjin
 * @version 1.0
 */
public class Decisions {
   /**
    * Get two integers from user and display if
    * the first integer is a multiple of the second integer.
    *
    * @param args A string array containing the command line arguments.
    */
   public static void main(String[] args) {
      // Create a Scanner object
      Scanner keyboard = new Scanner(System.in);

      // Prompts user for two integers
      System.out.println("Welcome to the Decision program!");
      System.out.print("Enter two integers, separated by a space: ");
      int number1 = keyboard.nextInt();
      int number2 = keyboard.nextInt();

      // Display if the first integer is a multiple of the second integer.
      if (number2 == 0) {
         System.out.println("The second number cannot be zero. " +
               "Please try again.");
      } else if (number1 % number2 == 0) {
         System.out.printf("%d is a multiple of %d with a factor of %d.\n",
               number1, number2, number1 / number2);
      } else {
         System.out.printf("%d is not a multiple of %d.\n", number1, number2);
      }

      System.out.println("Thanks for using the Decisions program!");

      // Close Scanner
      keyboard.close();
   }
}
