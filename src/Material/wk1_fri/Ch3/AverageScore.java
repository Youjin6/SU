package Material.wk1_fri.Ch3;

import java.util.Scanner;

/**
 * This program demonstrates the if statement.
 */

public class AverageScore {
    public static void main(String[] args) {
        double score1;    // To hold score #1
        double score2;    // To hold score #2
        double score3;    // To hold score #3
        double average;   // To hold the average score

        Scanner keyboard = new Scanner(System.in);

        // Get the first test score.
        System.out.print("Enter score #1:");
        score1 = keyboard.nextDouble();

        // Get the second score.
        System.out.print("Enter score #2:");
        score2 = keyboard.nextDouble();

        // Get the third test score.
        System.out.print("Enter score #3:");
        score3 = keyboard.nextDouble();

        // Calculate the average score.
        average = (score1 + score2 + score3) / 3.0;

        // Display the average score.
        System.out.print("The average is " + average);

        // If the score was greater than 95, let the user know
        // that's a great score.
        if (average > 95) {
           System.out.print("That's a great score!");
        }

        System.exit(0);
    }
}
