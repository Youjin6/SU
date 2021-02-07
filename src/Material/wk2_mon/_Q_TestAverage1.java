package Material.wk2_mon;

import java.util.Scanner;

/**
 * @author youjin
 */
public class _Q_TestAverage1 {
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        char repeat;
        String input;

        do {System.out.println("This program calculate the " +
                "average of three test scores");

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter score #1: ");
            score1 = keyboard.nextInt();

            System.out.println("Enter score #2: ");
            score2 = keyboard.nextInt();

            System.out.println("Enter score #3: ");
            score3 = keyboard.nextInt();

            // Consume the remaining newline
            keyboard.nextLine();

            average = (score1 + score2 + score3) / 3;
            System.out.println("The average is " + average);
            System.out.println();

            System.out.println("Would you like to average " +
                    "another set of test scores?");
            System.out.println("Enter Y for yes or N for NO: ");

            /*
             * read a line ????
             * */
            input = keyboard.nextLine();
            /*
             * charAt(0) 是 String 的方法, 不是 keyboard!
             * */
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y' );

    }

}
