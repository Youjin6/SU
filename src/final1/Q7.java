package final1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<String> arrayList = new ArrayList<>();
      arrayList = populateList(keyboard);
      for (String n : arrayList) {
         System.out.println(n);
      }

   }

   public static ArrayList<String> populateList(Scanner keyboard) {
      String repeat;
      String input;
      ArrayList<String> stringList = new ArrayList<>();
      do {
         System.out.print("Enter a string: ");
         input = keyboard.nextLine();
         stringList.add(input);

         System.out.print("Would you like to enter another string? (y/n): ");
         repeat = keyboard.nextLine();
      } while (repeat.equalsIgnoreCase("y"));

      return stringList;
   }
}
