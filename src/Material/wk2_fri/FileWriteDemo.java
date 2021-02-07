package Material.wk2_fri;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author youjin
 */
public class FileWriteDemo {
   public static void main(String[] args) throws FileNotFoundException {
      String filename;
      String friendName;
      int numFriends;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("How many friends you have? ");
      numFriends = keyboard.nextInt();

      keyboard.nextLine();

      System.out.println("Enter the file name: ");
      filename = keyboard.nextLine();

      PrintWriter outPutFile = new PrintWriter(filename);

      for (int i = 1; i <= numFriends; i++) {
         System.out.println("Enter the name of friend number " + i + ":");
         friendName = keyboard.nextLine();

         outPutFile.close();
         System.out.println("Data written to the file.");
      }
   }
}
