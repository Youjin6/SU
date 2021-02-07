package temp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This Quiz7 program implements an application that read a series of
 * numbers from a file and prints the numbers out to the standard output
 * @author Youjin Li
 * @version 1.0
 */
public class Quiz7 {
   /**
    * Call getNumbers and printList method
    *
    * @param args A string array containing the command line arguments.
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      ArrayList<Integer> numberList;

      numberList = getNumbers("sales.txt");
      printList(numberList);
   }

   /**
    * Read numbers from a file to an ArrayList
    *
    * @param filename The filename
    * @return A numberList
    * @throws IOException
    */
   public static ArrayList<Integer> getNumbers(String filename)
         throws IOException {
      ArrayList<Integer> numberList = new ArrayList<>();
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      while (inputFile.hasNext()) {
         numberList.add(inputFile.nextInt());
      }
      inputFile.close();
      return numberList;
   }

   /**
    * Print out the numbers to the standard output
    *
    * @param numbers The numbers get from a file
    */
   public static void printList(ArrayList<Integer> numbers) {
      for (Integer value : numbers) {
         System.out.print(value + " ");
      }
      System.out.println();
   }
}
