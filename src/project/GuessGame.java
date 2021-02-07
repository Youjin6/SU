package project;

import java.util.Random;
import java.util.Scanner;

/**
 * The GuessGame program plays a guessing game with the user.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class GuessGame {
   /**
    * Generate a "random" number within 1 through 100 and get an input from
    * user, then compare two numbers until they are the same, the entire
    * program can be repeated as many times as the user wishes.
    *
    * @param args A string array containing the command line arguments.
    */
   public static void main(String[] args) {
      String repeat;      // To control the loop
      int targetNumber;   // To hold the random number
      int inputNumber;    // To hold input

      // Create a Random object to generate a target number
      Random randomNumber = new Random();

      // Create a Scanner object to read the input
      Scanner keyboard = new Scanner(System.in);
      System.out.println("The GuessGame program plays a guessing game. " +
            "The program will choose a \"random\" \n" +
            "number between 1-100 and give the you a chance to guess " +
            "the number. You will be \ngiven an unlimited number " +
            "of guesses and on each guess, you will be told \n" +
            "whether your guess is too high, too low, or correct. " +
            "You will have the chance \nto repeat the " +
            "game as many times you wish.\n");

      // Repeat as many times of the game as user wants.
      do {
         targetNumber = randomNumber.nextInt(100) + 1;
         System.out.println("Let's begin...\n");

         // Prompts user for two integers
         System.out.print("Guess a number between 1-100: ");
         inputNumber = keyboard.nextInt();

         // Display if the input number is the same as the target number
         if (targetNumber != inputNumber) {
            while (targetNumber != inputNumber) {
               if (inputNumber > targetNumber) {
                  System.out.println("Your guess is too HIGH." +
                        " Try again.");
               } else {
                  System.out.println("Your guess is too LOW." +
                        " Try again.");
               }
               System.out.print("Guess a number between 1-100: ");
               inputNumber = keyboard.nextInt();
            }
         }
         System.out.println("Your guess is correct!\n");

         // Ask user if she/he wants to repeat the game.
         System.out.print("Would you like to guess another number (y/n)? ");
         keyboard.nextLine();
         repeat = keyboard.nextLine();
      } while (repeat.equalsIgnoreCase("y"));

      // Show goodbye message to user.
      System.out.println("\nThanks for playing the GuessGame!");

      keyboard.close();

   }
}
