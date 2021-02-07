package assignments.week5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This BinarySearch program implements an application that reads series of
 * numbers from a file and finds out if a target number is exit.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class BinarySearch {
   /**
    * Call the readFile getFile printArrayList selectionSort
    * printSortedArrayList repeatGame method to test the program.
    *
    * @param args A string array containing the command line arguments.
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      ArrayList<Integer> arrayList;   // To hold an ArrayList

      // Creat an Scanner
      Scanner keyboard = new Scanner(System.in);

      // Call readFile and pass the return value of getFilename as a parameter.
      arrayList = readFile(getFilename(keyboard));

      // Call printArrayList
      printArrayList(arrayList);

      // Call selectionSort
      selectionSort(arrayList);

      // Call printSortedArrayList
      printSortedArrayList(arrayList);

      // Call repeatGame
      repeatGame(keyboard, arrayList);

      // Close the Scanner
      keyboard.close();
   }


   /**
    * Sorts the original array.
    *
    * @param arrayList A arrayList read from the file
    */
   public static void selectionSort(ArrayList<Integer> arrayList) {
      int minIndex; // To hold the min index

      // The selection sort algorithm
      for (int i = 0; i < arrayList.size() - 1; i++) {
         minIndex = i;
         for (int j = i + 1; j < arrayList.size(); j++) {
            minIndex = arrayList.get(j) < arrayList.get(minIndex) ? j :
                  minIndex;
         }
         if (minIndex != i) {
            swap(arrayList, i, minIndex);
         }
      }
   }

   /**
    * Read the original numbers from a file
    *
    * @param filename The filename
    * @return An arraylist containing the original numbers
    * @throws IOException
    */
   public static ArrayList<Integer> readFile(String filename) throws
         IOException {
      // Creat an ArrayList object
      ArrayList<Integer> arrayList = new ArrayList<>();

      // Creat a File and a Scanner object
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      // Read the numbers from a file
      while (inputFile.hasNext()) {
         arrayList.add(inputFile.nextInt());
      }

      // Close the Scanner
      inputFile.close();

      return arrayList;
   }

   /**
    * Binary Search algorithm that searches for a target number
    *
    * @param arrayList An sorted array
    * @param target    The target number
    * @return The position of the target number
    */
   public static int binarySearch(ArrayList<Integer> arrayList, int target) {
      int left = 0; // initialize the left index
      int right = arrayList.size() - 1; // innitialize the right index
      int mid; // to hold the middle position of the array

      // Check if the ArrayList is a null pointer or size equals 0.
      if (arrayList == null || arrayList.size() == 0) {
         return -1;
      }

      // finds the target number
      while (left < right) {
         mid = left + ((right - left) >> 1);
         if (arrayList.get(mid) == target) {
            return mid;
         } else if (arrayList.get(mid) > target) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }
      }
      if (arrayList.get(left) == target) {
         return left;
      } else {
         return -1;
      }
   }

   /**
    * Prints out the position of the target number (-1 not found)
    *
    * @param target A target number for searching
    * @param index  The position of target number in an array
    */
   public static void printBinarySearchResult(int target, int index) {
      if (index == -1) {
         System.out.println(target + " not found.");
      } else {
         System.out.println(target + " found at " + index);
      }
   }

   /**
    * Gets a target number from users input
    *
    * @param keyboard A Scanner
    * @return The target numebr
    */
   public static int getTarget(Scanner keyboard) {
      int target; // holds the target number

      // Prompts users for a target number
      System.out.print("\nEnter a target number for searching: ");
      target = keyboard.nextInt();
      keyboard.nextLine();

      return target;

   }

   /**
    * Gets the filename from users
    *
    * @param keyboard A Scanner
    * @return A filename
    */
   public static String getFilename(Scanner keyboard) {
      String filename; // holds the filename

      // Prompts user for the filename
      System.out.print("\nEnter the filename: ");
      filename = keyboard.nextLine();

      return filename;
   }

   /**
    * Swap two numbers in the array
    *
    * @param arrayList An Arraylist
    * @param i         The first number
    * @param j         The second number
    */
   public static void swap(ArrayList<Integer> arrayList, int i, int j) {
      // Swaps the two item in the array
      int temp = arrayList.get(i);
      arrayList.set(i, arrayList.get(j));
      arrayList.set(j, temp);
   }

   /**
    * Prints out the original numbers from a file
    *
    * @param arrayList An ArrayList
    */
   public static void printArrayList(ArrayList<Integer> arrayList) {
      // Prints out the numbers
      System.out.println();
      System.out.println("Array list elements before sort: ");
      for (int i = 0; i < arrayList.size(); i++) {
         System.out.printf("index: %6d", i);
         System.out.printf("    value:%6d", arrayList.get(i));
         System.out.println();
      }
      System.out.println();
   }

   /**
    * Prints out the sorted array
    *
    * @param arrayList The ArrayList
    */
   public static void printSortedArrayList(ArrayList<Integer> arrayList) {
      // Prints out the sorted array to standard output
      System.out.println("Array list elements after sort: ");
      for (int i = 0; i < arrayList.size(); i++) {
         System.out.printf("index: %6d", i);
         System.out.printf("    value:%6d", arrayList.get(i));
         System.out.println();
      }
   }


   /**
    * Ask users if they want to play the game again
    *
    * @param keyboard  A Scanner
    * @param arrayList An ArrayList
    */
   public static void repeatGame(Scanner keyboard,
                                 ArrayList<Integer> arrayList) {
      int target;  // holds the target number
      int result;  // hold the result of binary Search algorithm
      String repeat; // holds yes or no

      // Repeat the game as many times as the users want
      do {
         target = getTarget(keyboard);
         result = binarySearch(arrayList, target);
         printBinarySearchResult(target, result);
         System.out.print("Would like to repeat (y/n)? ");
         repeat = keyboard.nextLine();
      } while ("y".equalsIgnoreCase(repeat));
   }
}
