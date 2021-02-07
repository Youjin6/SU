package _fuxi;

import java.util.Scanner;

/**
 * This program takes in a positive integer (x) from the user
 * and uses the integer to display several patterns on the screen.
 *
 * @author youjin
 * @version 1.0
 */
public class c04_PrettyFors {
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


        // Pattern 3: Multiplication table to X.
        System.out.printf("3. Multiplication table to %d.\n\n", number);

        for (int i = 0; i <= 4; i++) {
            System.out.print(" ");
        }
        //右对齐的时候 %4d, 但是要注意每一个 server 的缩进不一样, 例如 linux 是 8 个缩进
        for (int i = 1; i <= number; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            // 在两个 for 之间写的话可以看成是题号
            System.out.printf("%4d", i);
            for (int j = 1; j <= number; j++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }
        System.out.println("\n");

        // Pattern 4: display the outline of a diamond, with X at the widest point.
        System.out.printf("4. %d lines with one 1 on the first line,"
                + " 2 twos on the second, etc.\n   to %d. "
                + "%d's on the last line.\n", number, number, number);
        System.out.println();
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
