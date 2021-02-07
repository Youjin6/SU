package midterm;

import java.util.Scanner;

public class repetitiveDecision {
   public static void main(String[] args) {
      int number1;
      int number2;
      String repeat;
      System.out.println("Welcome to the Repeating program!");
      Scanner keyboard = new Scanner(System.in);

      do {
         System.out.print("\nEnter two numbers, separated br a space: ");
         number1 = keyboard.nextInt();
         number2 = keyboard.nextInt();

         if (number2 == 0) {
            System.out.println("The second number cannot ne zero. Please try " +
                  "again.");
         } else if (number1 % number2 == 0) {
            System.out.println(number1 + " is a multiple of " + number2 + " " +
                  "with a factor of " + (number1/number2));
         } else {
            System.out.println(number1 + " is NOT a multiple of " + number2 +
                  ".");
         }

         keyboard.nextLine();
         System.out.print("Would you like to repeat (y/n)? ");
         repeat = keyboard.nextLine();

      } while(repeat.equalsIgnoreCase("y"));

      System.out.println("\nThanks");
      keyboard.close();
   }
}
