package midterm;

import java.util.Scanner;

public class MadLibs {
   public static void main(String[] args) {
      String name;
      int age;
      String place;
      String college;
      String profession;
      String animal;
      String nameOfAnimal;

      System.out.println("Welcome to the Mad Libs game! You will be asked  to" +
            " enter specific input. \n" + "Let's begin.\n");

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a name: ");
      name = keyboard.nextLine();

      System.out.println(name);
   }
}
