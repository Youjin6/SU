package assignments.week2;

import java.util.Scanner;

/**
 * This program takes in a positive integer (x) from the user
 * and uses the integer to display several patterns on the screen.
 *
 * @author youjin
 * @version 1.0
 */
public class PrettyFors {
    /**
     * Get a positive integer from user and uses
     * the integer to display several patterns on the screen.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompts user for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = keyboard.nextInt();
        while (number <= 0) {
            System.out.print("Please enter a positive integer: ");
            number = keyboard.nextInt();
        }
        System.out.println();

        // Pattern 1: display X copies of X on one line.
        System.out.printf("1. %d copies of %d on one line.\n", number, number);
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print(number);
        }
        System.out.println("\n\n");

        // Pattern 2: display X lines with a single 1 on each line.
        System.out.printf("2. %d lines with a single 1 on each line.\n\n", number);
        for (int i = 0; i < number; i++) {
            System.out.println("1");
        }
        System.out.println("\n");

        // Pattern 3: Multiplication table to X.
        System.out.printf("3. Multiplication table to %d.\n\n", number);
        final int ONE = 1;
        for (int i = 0; i < ONE; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= number; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d", i);
            for (int j = 1; j <= number; j++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }
        System.out.println("\n");

        // 4. X lines with one 1 on the first line, 2 twos on the second, etc.
        //   to X X's on the last line.
        System.out.printf("4. %d lines with one 1 on the first line,"
                + " 2 twos on the second, etc.\n   to %d. "
                + "%d's on the last line.\n\n", number, number, number);
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        /* Pattern 5: display the outline of a diamond, with X at the
         widest point.  */
        System.out.printf("5. The outline of a diamond, with X at " +
                "the widest point.\n\n");
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        for (int i = number - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
