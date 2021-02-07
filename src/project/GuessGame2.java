package project;

import java.util.Random;
import java.util.Scanner;

public class GuessGame2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        String repeat;

        // game
        do {
            System.out.println("Let's begin...\n");
            int targetNumber = randomNumber.nextInt(100) + 1;
            System.out.println(targetNumber);
            System.out.println("Guess a number between 1-100: ");
            int inputNumber = keyboard.nextInt();

            if (inputNumber == targetNumber) {
                System.out.println("Your guess is correct!");
            } else {

            }

            System.out.println("Would you like to guess another number (y/n)? ");
            keyboard.nextLine();
            repeat = keyboard.nextLine();

        } while (repeat.equalsIgnoreCase("y"));
    }
}
