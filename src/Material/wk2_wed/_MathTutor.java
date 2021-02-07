package Material.wk2_wed;

import java.util.Random;
import java.util.Scanner;
/*
 * 随机数生成器
 * Random rand = new Random();
 * number1 = rand.nextInt(bound:x); // 生成 [0,x) 范围内的数
 * */

/**
 * @author youjin
 */
public class _MathTutor {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;
        int input;

        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        number1 = randomNumbers.nextInt(100);
        number2 = randomNumbers.nextInt(100);
        sum = number1 + number2;
        System.out.printf("What's the sum of %d and %d?: ", number1, number2);
        input = keyboard.nextInt();
        if (input == sum) {
            System.out.println("Your answer is right!");
        } else {
            System.out.println("Wrong!");
        }
    }

}
