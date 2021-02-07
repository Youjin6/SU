package ICE;

import java.util.Scanner;

public class Week2_Mon {

   public static void main(String[] args) {
      int age;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter your age: ");
      age = keyboard.nextInt();

      while (age < 0) {
         System.out.println("Please validate that " +
               "the age you entered is non-negative.");
         System.out.print("Please enter your age: ");
         age = keyboard.nextInt();
      }

      if (age >= 18) {
         System.out.printf("You are %d years old. " +
               "You're old enough to vote!\n", age);
      } else {
         System.out.printf("You are %d years old. " +
               "You have to wait %d years to vote.", age, 18 - age);
      }
      
   }

}
