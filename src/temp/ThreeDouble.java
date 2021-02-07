package temp;

import java.util.Scanner;


import java.util.Scanner;


public class ThreeDouble {
    public static void main(String[] args) {
        double num = 0;
        double largest = num;
        String repeat;
        int count = 0;
        Scanner keyboard = new Scanner(System.in);

        do {
            for (int i = 1; i <= 3; i++) {
                System.out.printf("Enter the #%d number: ", i);
                num = keyboard.nextInt();
                if (num > largest) {
                    largest = num;
                }
            }
            System.out.printf("The largest number is %f\n", largest);
            System.out.print("Do you want to repeat the game? (y/n): ");
            keyboard.nextLine();
            repeat = keyboard.nextLine();
            count++;
        } while (repeat.equalsIgnoreCase("y"));

        System.out.printf("\nYou did the task %d times\n", count);
    }
}