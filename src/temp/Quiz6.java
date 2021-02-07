package temp;

import java.util.Random;

/**
 * The Quiz6 program implements an application that generates 5 random numbers
 * and prints them out to the standard output.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class Quiz6 {
    /**
     * Generate 5 random numbers into an array and pass the
     * array as a parameter into printArray method.
     *
     * @param args  A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        final int MIN = 1;          // To hold min value as a constant
        final int MAX = 100;        // To hold max value as a constant
        final int ARRAY_SIZE = 5;   // To hold the array size
        int[] array = new int[ARRAY_SIZE]; // To hold an array

        // Generate a Random object
        Random randomNum = new Random();

        // Generate 5 random numbers in an array
        for (int index = 0; index < array.length; index++) {
            array[index] = randomNum.nextInt(1 + MAX - MIN) + MIN;
        }

        // Call printArray method
        printArray(array);

    }

    /**
     * Print elements in the array to standard output.
     *
     * @param array an array that stored random numbers
     */
    public static void printArray(int[] array) {
        System.out.print("Numbers: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
