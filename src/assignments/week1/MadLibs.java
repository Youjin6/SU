package assignments.week1;

import java.util.Scanner;

/**
 * This MadLibs program implements an application that
 * will ask user's information and get it from standard input
 * Then, display the description messages back to user.
 *
 * @author youjin
 * @version 1.0
 */
public class MadLibs {
    /**
     * Get the user input from standard input and plug the information
     * in to the produce, then, display the message on standard output.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {

        // To hold the user's name
        String name;
        // To hold user's age
        int age;
        // To hold user's place of birth
        String place;
        // To hold user's college name
        String college;
        // To hold user's profession
        String profession;
        // To hold user's animal
        String animal;
        // To hold the animal's name
        String nameOfAnimal;

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Display a welcome information to user
        System.out.println("Welcome to the Mad Libs game! You will " +
              "be asked to enter specific input. \n" +
                "Let's begin.\n");

        // Get the user's name
        System.out.print("Enter a name: ");
        name = keyboard.nextLine();

        // Get the user's age
        System.out.print("Enter an age: ");
        age = keyboard.nextInt();

        // Consume the remaining newline.
        keyboard.nextLine();

        // Get the user's place of birth
        System.out.print("Enter a place: ");
        place = keyboard.nextLine();

        // Get the user's college name
        System.out.print("Enter a college: ");
        college = keyboard.nextLine();

        // Get the user's profession
        System.out.print("Enter a profession: ");
        profession = keyboard.nextLine();

        // Get the user's animal
        System.out.print("Enter an animal: ");
        animal = keyboard.nextLine();

        // Get the animal's name
        System.out.print("Enter a pet name: ");
        nameOfAnimal = keyboard.nextLine();

        // Display a blank line
        System.out.println();

        // Display the information back to user
        System.out.println("There once was a person named " + name +
                " who lived in " + place + ". At the age of " + age + ",\n" +
                name + " went to college at " + college + ". " +
                name + " graduated and went to work as" + " a\n" +
                profession + ". " + "Then, " + name + " adopted a(n) " +
                animal + " named " + nameOfAnimal + ". " + "They both\n" +
                "lived happily ever after!\n");

        // Display goodbye message to user
        System.out.println("Thanks for playing the Mad Libs game!");

        // Close Sc

    }
}
