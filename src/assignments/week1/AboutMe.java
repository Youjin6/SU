package assignments.week1;
/**
 * Instructions:
 * Create a Java program that displays the following pieces of information, each on a separate line and labeled:
 *
 * Your name
 * Your favorite color
 * Your place of birth
 *
 * You must name your file AboutMe.java.
 *
 * Hints:
 *
 * Remember to give your class and file the same name!
 * You can compile and run locally in CS1 with the following commands:
 * javac AboutMe.java
 * java AboutMe
 * Sample output:
 * [username@cs1 lab1]$ java AboutMe
 * Name: Nellie
 * Favorite Color: Brown
 * Place of Birth: Bellevue, WA
 */


/**
 * This is a program that will print Yucong's information to screen.
 * @author Yucong Li
 * @version 1.0
 */
public class AboutMe {
    /**
     * Displays out Yucong's name, favorite color and place of birth
     * to standard output.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        // Display Yucong's information on standard output
        System.out.println("Name: Yucong Li\nFavorite Color: Green\nPlace of Birth: Henan China");
    }
}
