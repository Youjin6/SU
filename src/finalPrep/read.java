package finalPrep;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class read {
   public static void main(String[] args) throws IOException {
      final String FILENAME = "haha.txt";
      File file = new File(FILENAME);
      Scanner inputFile = new Scanner(file);
      while (inputFile.hasNext()) {

      }
   }
}
