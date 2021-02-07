package Material.wk5_Mon;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.ReadOnlyBufferException;
import java.util.Random;
import java.util.Scanner;

public class ObjectDemo {
   public static void main(String[] args) throws FileNotFoundException {
      int maxNumbers;
      int number;

      Scanner keyboard = new Scanner(System.in);
      Random rand = new Random();

      PrintWriter outputFile = new PrintWriter("numbers.txt");


      System.out.print("How many random numbers should I write? ");
      maxNumbers = keyboard.nextInt();

      for (int i = 0; i < maxNumbers; i++) {
         number = rand.nextInt();
         outputFile.println(number);
      }
      outputFile.close();
      System.out.println("Done");
   }
}
