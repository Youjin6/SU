package temp;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        String friendName = "";
        int numFriends;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of friends you have: ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 1; i <= numFriends; i++) {
            System.out.printf("Enter the name of friend #%d: ", i);
            friendName += keyboard.nextLine() + " ";
        }

        System.out.println("\nThe names of friends: ");
        System.out.println(friendName);
    }
}
