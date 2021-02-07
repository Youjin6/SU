package _fuxi;

/*
 * 思路:
 *      do...while 先执行循环体, 后判断条件, 若满足条件, 则进入循环体
 * 语法:
 *      do{
 *
 *      } while ()
 * 坑:
 *         1. while(条件)  --> 只需要判断是否为 Y y, 不用判断 Nn, 除了 Yy所有的都字母都不执行循环.
 *  !!!!!! 2. 在 nextInt 和 nextLine 之间要有 consume 掉新的一行, 一写完 nextInt/Double/Long 就写一行它 !!!!!
 * */

import java.util.Scanner;

/**
 * 设计一个计算三个分数平均值得游戏,需求:
 * 1. 接受用户输入 score1,2,3
 * 2. 给用户返回 average
 * 3. 询问用户是否继续输入另外三个数
 * 4. 获取用户 Y/N
 * 5. 使用 do while 语句
 */

public class c01_repeatDoWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String input; /* bug3: 这两个变量的声明不能在 do 循环里面,
                               while 中再次调用的话会识别不到*/
        char repeat;

        do {
            System.out.println("Enter score #1");
            int score1 = keyboard.nextInt();

            System.out.println("Enter score #2");
            int score2 = keyboard.nextInt();

            System.out.println("Enter score #3");
            int score3 = keyboard.nextInt();

            keyboard.nextLine(); /* bug2: 这句没有的话, 会报错, 因为下面有 nextLine()*/

            double average = (score1 + score2 + score3) / 3;

            System.out.println("Your average score is: " + average);
            System.out.println("Do you want to start a new set of score? ");
            System.out.println("Enter Y for YES, N for NO");

            input = keyboard.nextLine();
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');
        /*
        bug1: while(repeat == 'Y' || 'y') 不能这样子写
         */
    }
}
