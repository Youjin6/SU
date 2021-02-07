package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This LinearSearch program implements an application that read and print
 * values from an input file and will ask users for a target number, then
 * tell them where the number is.
 *
 * @author youjin
 * @version 1.0
 */
public class LinearSearch {
   /**
    * @param args A string array containing the command line arguments.
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      // Creat a Scanner object
      Scanner keyboard = new Scanner(System.in);

      // Call printElements
      printElements(keyboard);

      // Close the Scanner
      keyboard.close();
   }

   /**
    * @param keyboard A Scanner
    * @return The filename
    */
   public static String getFilename(Scanner keyboard) {
      String filename;  // to hold the filename

      // prompts the users for the filename
      System.out.print("\nEnter the filename: ");
      filename = keyboard.nextLine();
      System.out.println();

      return filename;
   }

   /**
    * @param keyboard A scanner
    * @return A number get from the user
    */
   public static int getTarget(Scanner keyboard) {
      int target;    // to hold the target number

      // prompts users for a target number
      System.out.print("\nEnter a number to search in the array: ");
      target = keyboard.nextInt();
      keyboard.nextLine();

      return target;
   }

   /**
    * @param keyboard A Scanner
    * @return A String repeat
    */
   public static String getIfRepeat(Scanner keyboard) {
      String repeat;    // to hold yes or no

      // Ask users if they want to repeat the game
      System.out.print("Would you like to repeat(y/n)? ");
      repeat = keyboard.nextLine();

      return repeat;
   }

   /**
    * @param array  The array from the file
    * @param length The length of valid number exit in the array
    * @param target The target number for search
    */
   public static int linearSearch(int[] array, int length, int target) {
      int index = 0;    // to initialize the index of the array
      // find the index of the target numebr
      while (index < length && array[index] != target) {
         index++;
      }
      // return the index of number or return -1
      if (index < length) {
         return index;
      } else {
         return -1;
      }

   }

   /**
    * Print out the position of the target
    *
    * @param result The position of the target number (-1 not found)
    * @param target The target number
    */
   public static void printResult(int result, int target) {
      if (result == -1) {
         System.out.println(target + " not found");
      } else {
         System.out.println(target + " found at " + result);
      }
   }

   /**
    * Read the elements from a file, print out each element and
    * the position of the target number.
    *
    * @param keyboard A Scanner
    * @throws IOException
    */
   public static void printElements(Scanner keyboard) throws IOException {
      String filename;
      final int ARRAY_SIZE = 50;       // To initialize the array size
      int[] array = new int[ARRAY_SIZE]; // To creat an array object
      int length;    // To hold the number of elements in the array
      int result;    // to hold the position of target numebr
      int target;    // To hold the target number
      String repeat; // To hold yes or no

      // Call getFilename
      filename = getFilename(keyboard);

      // Creat File object and a ScannerL
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      // Get data from the file
      length = 0;
      while (inputFile.hasNext()) {
         array[length++] = inputFile.nextInt();
      }
      inputFile.close();

      // Print out the elements in the file
      System.out.println("Array elements:");
      for (int i = 0; i < length; i++) {
         System.out.printf("arr[%d]: %d\n", i, array[i]);
      }

      // Repeat the game as many times as the users want
      do {
         target = getTarget(keyboard);
         result = linearSearch(array, length, target);

         // Call printResult
         printResult(result, target);

         // Call getIfRepeat
         repeat = getIfRepeat(keyboard);
      } while ("y".equalsIgnoreCase(repeat));
   }
}
