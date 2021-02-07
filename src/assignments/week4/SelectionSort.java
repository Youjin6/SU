package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This SelectionSort program implements an application that read the strings
 * from a file and print out the array before sorting and a sorted array by
 * dictionary order.
 *
 * @author Yucong Li
 * @version 1.0
 */
public class SelectionSort {
   /**
    * Call printFile method
    *
    * @param args A string array containing the command line arguments.
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      String filename;  // To hold the filename
      // Call getFilename
      filename = getFilename();
      // Call printFile
      printElements(filename);
   }

   /**
    * Sort the raw array by the lexicographical order
    *
    * @param array  A string array that read from a file
    * @param length The number of element in the array
    * @return An sorted array by lexicographical order
    */
   public static String[] selectionSort(String[] array, int length) {
      int minIndex; // To hold the min index

      // The selection sort algorithm
      for (int i = 0; i < length - 1; i++) {
         minIndex = i;
         for (int j = i + 1; j < length; j++)
            minIndex = array[j].compareTo(array[minIndex]) < 1 ? j : minIndex;
         if (minIndex != i)
            swap(array, i, minIndex);
      }

      return array;
   }

   /**
    * Swap two elements
    *
    * @param array An array
    * @param i     The first element
    * @param j     The second element
    */
   public static void swap(String[] array, int i, int j) {
      String temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

   /**
    * Get the filename
    *
    * @return The filename
    */
   public static String getFilename() {

      final String filename = "/home/fac/ohsh/submit/21wq5001/files/lab9input" +
            ".txt";

      return filename;
   }

   /**
    * Read a file and print out the elements in the array, call the
    * selectionSort method and then print out the sorted array to standard
    * output.
    *
    * @param filename A filename
    * @throws IOException
    */
   public static void printElements(String filename) throws IOException {
      int length; // To hold the length of the array
      final int ARRAY_SIZE = 60;  // To hold the constant size of the array

      // Initialize the array to hold the elements read from the file
      String[] array = new String[ARRAY_SIZE];

      // To hold the sorted array
      String[] sortedArray;

      // Read the file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      length = 0;
      while (inputFile.hasNext()) {
         array[length++] = inputFile.nextLine();
      }
      inputFile.close();

      // Print out the elements in the file
      System.out.println("\nArray before sorting: ");
      for (int i = 0; i < length; i++) {
         System.out.println("arr[" + i + "]: " + array[i]);
      }
      System.out.println();

      // Call selectionSort method
      sortedArray = selectionSort(array, length);

      // Print out the elements in the sorted array
      System.out.println("Array after sorting: ");
      for (int i = 0; i < length; i++) {
         System.out.println("arr[" + i + "]: " + sortedArray[i]);
      }
   }
}
