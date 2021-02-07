package temp;

import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter an integer: ");
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();

        if (num == 0) {
            System.out.println("\"error message\"");
        } else if (num > 0) {
            System.out.printf("The cube of %d is: %d\n", num, num * num * num);
        } else {
            System.out.printf("The square of %d is: %d\n", num, num * num);
        }
        keyboard.close();

    }

}