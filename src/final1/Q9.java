package final1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q9 {
   public static void main(String[] args) throws IOException {
      Scanner keyboard = new Scanner(System.in);
      final String FILENAME = "phrases.txt";
      readStrings(FILENAME,keyboard);

   }

   public static String readStrings(String filename,
                                               Scanner keyboard)
         throws IOException {
      String phrases = "";
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      while (inputFile.hasNext()) {
         phrases += inputFile.nextLine() + "\n";
      }
      System.out.println("original: ");
      System.out.println(phrases);

      printReverse(phrases);
      return phrases;
   }

   public static void printReverse(String phrases) {
      System.out.print("reverse: ");
      for (int i = phrases.length() - 1; i > 0; i--) {
         System.out.print(phrases.charAt(i));
      }
      System.out.println();
   }
}
