package _fuxi;

import javax.swing.*;
/* 注意:
 * JOptionPane.showInputDialog()
 * JOptionPane.shouMessageDialog()
 *
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 1. JOptionPane 只能接受 String
 * 2. 接手后用 Integer.parseInt(input) 方法转成 int 形式
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *  */

/**
 * @author youjin
 */
public class c02_TotalSales {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales;
        String input;


        /* bug1: 不用 "new" JOptionPane() */
        input = JOptionPane.showInputDialog("For how many days " +
                "do you have sales figure?: "); /* bug1: input 只是一个接受器, 之后就付给 days,
                                                接下来还可以使用 input 接收, 再付给其他变量*/

        days = Integer.parseInt(input);

        totalSales = 0.0;
        for (int count = 1; count <= days; count++) {

            /* bug3: 不能写成, 跟 printf 一样的格式, 实现方法下面 line48 */
//            input = JOptionPane.showInputDialog("Enter the sales for day %d :", count);
            input = JOptionPane.showInputDialog("Enter the sales for day " + count + ": ");


            sales = Double.parseDouble(input);
            /* bug2: totalSales 不初始化就不能用 */
            totalSales += sales;
        }

        /* bug3: 若想写成 printf 一样的格式按照下面的 */
        /* bug4: 不用 \n */
        /* bug5: %.2f 写成 %f.2 了 */
        /* bug6: showMessageDialog 不会出现输入框 */
        /* bug7: ,totalSales 别写到括号外头了*/
        /* bug8: System.exit(0),别写到大括号外头了 */
        JOptionPane.showMessageDialog(null, String.format("Your totalSales is %.2f\n", totalSales));
        System.exit(0);
    }
}
