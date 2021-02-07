package Material.wk2_wed;

import java.util.Scanner;

/**
 * @author youjin
 */
public class UserSquares {
    public static void main(String[] args) {
        int number;
        int maxValue;

        System.out.println("I will display a table of numbers and their squares.");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How High Should I Go?: ");
        maxValue = keyboard.nextInt();

        System.out.println("Number\tNumberSquared");
        System.out.println("-------------------------");
        for (number = 1; number <= maxValue ; number++) {
            System.out.println(number + "\t\t" + number * number);

        }
    }
}
