package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * The ArrayDistribution program implements an application that read a series
 * of numbers from a file and distributes them as negative, odd and even
 * number to the correct array and prints out to the standard output.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class ArrayDistribution {
   /**
    * Call getFilename method and pass the name to getDistribution method
    *
    * @param args A string array containing the command line arguments.
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      String filename; // To hold filename
      // Creat a Scanner object
      Scanner keyboard = new Scanner(System.in);

      // Call getFilename method
      filename = getFilename(keyboard);

      // Call getDistribution Method
      getDistribution(filename);

      // Close Scanner
      keyboard.close();
   }

   /**
    * Prompts users for the filename.
    *
    * @param keyboard Scanner object
    * @return filename
    */
   public static String getFilename(Scanner keyboard) {
      String filename; // To hold filename

      // Prompts user for the filename
      System.out.print("\nEnter the filename: ");
      filename = keyboard.nextLine();

      return filename;
   }

   /**
    * Read numbers from the file and display the distributed numbers to
    * standard output.
    *
    * @param filename the filename
    * @throws IOException
    */
   public static void getDistribution(String filename) throws IOException {
      final int TWO = 2; // to hold constant number 2
      final int THIRTY = 30; // to hold constant 30 for max capacity
      int number; // To hold number
      int[] negNum = new int[THIRTY]; // To initialize negNum array
      int indexNeg = 0; // To initialize index for negNum array
      int[] evenNum = new int[THIRTY]; // To initialize evenNum array
      int indexEven = 0; // To initialize index for evenNum array
      int[] oddNum = new int[THIRTY]; // To initialize oddNum array
      int indexOdd = 0; // To initialize index for oddNum array

      // Creat a File object
      File file = new File(filename);

      // Creat a Scanner object
      Scanner inputFile = new Scanner(file);

      // To allocate the numbers to correct place
      while (inputFile.hasNext()) {
         number = inputFile.nextInt();
         if (number < 0) {
            negNum[indexNeg++] = number;
         } else if (number % TWO == 0 && number !=0) {
            oddNum[indexOdd++] = number;
         } else if (number != 0){
            evenNum[indexEven++] = number;
         }
      }

      // To display the elements in the evenNum array.
      System.out.println();
      for (int i = 0; i < evenNum.length; i++) {
         if (evenNum[i] != 0)
            System.out.printf("evenNum[%d]: %d\n", i, evenNum[i]);
      }
      System.out.println();
      // To display the elements in the oddNum array.
      for (int i = 0; i < oddNum.length; i++) {
         if (oddNum[i] != 0)
            System.out.printf("oddNum[%d]: %d\n", i, oddNum[i]);
      }
      System.out.println();

      // To display the elements in the negNum array.
      for (int i = 0; i < negNum.length; i++) {
         if (negNum[i] != 0)
            System.out.printf("negNum[%d]: %d\n", i, negNum[i]);
      }

      // Close Scanner
      inputFile.close();


   }

}
