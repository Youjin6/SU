package Material.wk2_wed;

import java.util.Random;
import java.util.Scanner;

/**
 * @author youjin
 */
public class _RollDice {
    public static void main(String[] args) {

        String repeat;
        char c;
        Scanner keyboard = new Scanner(System.in);

        do {
            Random random = new Random();
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            System.out.println("Rolling the dice...");
            System.out.println("Their values are: ");
            System.out.println(dice1 + " " + dice2);
            System.out.println("Roll them again (y = yes)?");
            repeat = keyboard.nextLine();
//            c = repeat.charAt(0);
            /* 类比
            1. 从 scanner 接受一个 string,
            2. charAt(0)变为 char,
            3. 再判断 repeat=='y' || repeat == 'Y'
            直接用
            StringVariable.equalsIgnoreCase("y") // 注意里面是 ""
            */
        } while (repeat.equalsIgnoreCase("y"));
    }
}
