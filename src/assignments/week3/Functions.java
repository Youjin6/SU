package assignments.week3;

import java.util.Scanner;

/**
 * The Functions program implements an application that
 * takes an integer range of 2 to 25 from users and use expression (x *
 * 2) - (x + 25) to calculate the result, then give the correct result back
 * to the user.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class Functions {
    /**
     * Tests all the functions below ("welcome", "goodbye", "inputNum", and
     * "calculate")
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        // Call welcome method
        welcome();

        // Call calculate method, passing the return value in inputNum
        // method as an argument, and print the result to the standard output.
        System.out.println("The result is: " + calculate(inputNum()));

        // Call goodbye method
        goodbye();
    }

    /**
     * Prints a welcome message
     */
    public static void welcome() {
        System.out.println("Welcome to the Functions program! The program " +
                "will request a number \n" +
                "between 5 and 25 and return the calculated result.\n");
    }

    /**
     * Prints a goodbye message
     */
    public static void goodbye() {
        System.out.println("\nThanks for using the Functions program!");
    }

    /**
     * Requests a value from the user in the range of 5 to 25
     *
     * @return a valid value
     */
    public static int inputNum() {
        int number; // To hold a input number from user

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a valid number in the range of 5 to 25
        do {
            System.out.print("Enter an integer between 5 and 25: ");
            number = keyboard.nextInt();
        } while (number < 5 || number > 25);

        return number;
    }

    /**
     * Takes in a number and calculate the result from the expression
     * (number * 2) - (number + 25)
     *
     * @param number an integer
     * @return The value of the result of the expression
     */
    public static int calculate(int number) {
        int result; // To hold the result
        result = (number * 2) - (number + 25);
        return result;
    }
}
