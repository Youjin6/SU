package Material.wk2_wed;
/*
* JOptionPane.showInputDialog()
* JOptionPane.shouMessageDialog()
* */
import javax.swing.*;

/**
 * @author youjin
 */
public class _TotalSales {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales;
        String input;

        /* 注意:
         * 1. JOptionPane 只能接受 String
         * 2. 接手后用 Integer.parseInt(input) 方法转成 int 形式
         *
         *  */
        input = JOptionPane.showInputDialog("For how many days " +
                "do you have sales figure?"); /* bug1: input 只是一个接受器, 之后就付给 days,
                                                接下来还可以使用 input 接收, 再付给其他变量*/

        // convert a string to an int
        days = Integer.parseInt(input);

        totalSales = 0.0;

        for (int count = 1; count <= days; count++) {

            input = JOptionPane.showInputDialog("Enter the sales " +
                    "for day " + count + ": ");
            sales = Double.parseDouble(input);
            totalSales += sales;
        }

        JOptionPane.showInputDialog(null, String.format("The total sales are $%,.2f", totalSales));

        System.exit(0);
    }
}
