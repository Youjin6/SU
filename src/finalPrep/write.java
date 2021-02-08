package finalPrep;

import java.io.IOException;
import java.io.PrintWriter;

public class write {
   public static void main(String[] args) throws IOException {
      PrintWriter outputFile = new PrintWriter("phrases.txt");
      outputFile.println("Dogs are cool\n" +
            "Cats are the best\n");
      outputFile.close();
   }
}
