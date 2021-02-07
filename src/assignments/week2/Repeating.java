package assignments.week2;
/*
 * 注意:
 * 一直没有搞清的一个问题是:
 * int number1 = keyboard.nextInt();
 * int number2 = keyboard.nextInt();
 * 是可以一次,在控制台的一行, 接受两个输入的, 并且分别赋值给 number1, number2
 */

import java.util.Scanner;

/**
 * This program allow the user to repeat the program as many
 * times as desired to display if the first integer is a multiple
 * of the second integer that the user entered.
 *
 * @author youjin
 * @version 1.0
 */
public class Repeating {
    /**
     * Repeatedly run the program until user wants to finish the game.
     * Get two integers from user and display the result that if the first
     * integer is a multiple of the second integer to standard output.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {

        String input;   // To hold the input
        char repeat;    // To control the loop

        // Create a Scanner object to read the input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the decision program!");


        // Get as many results of the game as user wants.
        do {
            // Prompts user for two integers
            System.out.println();
            System.out.print("Enter two integers, separated by a space: ");
            int number1 = keyboard.nextInt();
            int number2 = keyboard.nextInt();
            keyboard.nextLine();

            // Display if the first integer is a multiple of the second integer.
            if (number2 == 0) {
                System.out.println("The second number cannot be zero. " +
                        "Please try again.");
            } else if (number1 % number2 == 0) {
                System.out.printf("%d is a multiple of %d with a factor of %d" +
                        ".\n", number1, number2, number1 / number2);
            } else {
                System.out.printf("%d is NOT a multiple of %d.\n",
                        number1, number2);
            }

            // Ask user if she/he wants to repeat the game.
            System.out.print("Would you like to repeat (y/n)? ");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');

        // Show goodbye message to user.
        System.out.println("\nThanks for using the Decisions program!");

        // Close Scanner
        keyboard.close();
    }
}
