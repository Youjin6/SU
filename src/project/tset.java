package project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class tset {
   public static void main(String[] args) throws IOException {
      final int TEN = 0;
      // Creates File and Scanner object
      File file = new File("winnerList.txt");
      Scanner inputFile = new Scanner(file);
      ArrayList<String> nameList = new ArrayList<>();

      // Reads the names from a file
      while (inputFile.hasNext()) {
         nameList.add(inputFile.nextLine());
      }

      // Call printLine method


      // Prints out the names to standard output
      System.out.println("WINNER LIST: ");
      for (int i = nameList.size() - 1; i > nameList.size() - 1 - TEN; i--) {
         System.out.print(nameList.get(i) + " ");
      }
//      for (String name : nameList) {
//         System.out.print(name + " ");
//      }

      // Call printLine method

      // Close the Scanner
      inputFile.close();
   }
}
