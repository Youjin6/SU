package _fuxi;

import java.util.Scanner;
/*
* while 循环, 第一次操作在 while 外面的情况.
* 进入 while 就要先 更新 total sales
*
* */
/**
 * @author youjin
 */
public class c03_SoccerPoints {
    public static void main(String[] args) {
        System.out.println("Enter your points, Enter -1 finish");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your points or -1 to end: ");
        int points = keyboard.nextInt();
        int totalPoints = 0;

        while (points != -1) {
            totalPoints += points;
            System.out.print("Enter your points or -1 to end: ");
            points = keyboard.nextInt();
        }

        System.out.printf("Your total points are: %d",totalPoints);
    }
}
