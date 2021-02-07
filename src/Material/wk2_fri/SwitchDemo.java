package Material.wk2_fri;
/**
 * 注意:
 * 1. case:
 * 2. break;
 * 3. default:
 */

import java.util.Scanner;

public class SwitchDemo {
   public static void main(String[] args) {
      int number;

      System.out.print("Enter 1, 2 or 3: ");
      Scanner keyboard = new Scanner(System.in);
      number = keyboard.nextInt();
      switch (number) {
         case 1:
            System.out.println("You entered 1.");
            break;
         case 2:
            System.out.println("You entered 2");
            break;
         case 3:
            System.out.println("You entered 3");
            break;
         default:
            System.out.println("That's not 1, 2 or 3");
      }
   }
}
