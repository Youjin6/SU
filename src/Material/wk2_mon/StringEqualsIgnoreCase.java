package Material.wk2_mon;

import java.util.Scanner;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {
         String input;
         Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a secret word: ");
        input = keyboard.nextLine();

         /*
         * NOTICE:
         * 阿里给我改过来, 把 "XXX" 放在前面, input 参数放里面.
         * */
        if ("PROFESSION".equalsIgnoreCase(input)) {
            System.out.println("Cong you know the word!");
        } else {
            System.out.println("Sorry, it's not the secret word");
        }
    }
}
