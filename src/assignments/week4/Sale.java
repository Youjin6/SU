package assignments.week4;

import java.io.IOException;
import java.io.PrintWriter;

public class Sale {
   public static void main(String[] args) throws IOException {
      PrintWriter outputFile = new PrintWriter("sales.txt");
      outputFile.println("3\n" +
            "0\n" +
            "-7\n" +
            "8\n" +
            "23\n" +
            "89\n" +
            "134\n" +
            "-4\n" +
            "-1\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "9\n" +
            "1\n" +
            "5\n" +
            "6\n" +
            "27\n" +
            "98\n" +
            "-3\n" +
            "-20\n" +
            "3\n" +
            "37\n" +
            "126\n" +
            "-1098");
      outputFile.close();
   }
}
