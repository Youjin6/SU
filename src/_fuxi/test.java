package _fuxi;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        int days;
        String input;
        double sales;
        double totalSales = 0.0;
        input = JOptionPane.showInputDialog("For how many days do you have a sales figure?: ");
        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count++) {
            input = JOptionPane.showInputDialog("Enter the sales for day " + count + ":");
            sales = Integer.parseInt(input);
            totalSales += sales;
        }

//        JOptionPane.showMessageDialog(null,String.format("Your total Sales are %,.2f"),totalSales);
        JOptionPane.showMessageDialog(null, String.format("Your totatlSales id %.2f", totalSales));
        System.exit(0);
    }

}
