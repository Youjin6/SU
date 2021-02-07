package Material.wk3_fri;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        final int ONE_WEEK = 7;
        double[] sales = new double[ONE_WEEK];
        getValues(sales);
        for (double val : sales) {
            System.out.println(val);
        }
    }

    private static void getValues(double[] array) {
        Scanner keyboard = new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter the sales for day " + (index + 1) + ": ");
            array[index] = keyboard.nextDouble();
        }
    }
}
