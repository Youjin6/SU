package temp;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SaleResult {
    public static void main(String[] args) throws IOException {
        final int NUM_DAY = 30;
        String filename;
        double totalSales;
        double averageSales;

        filename = getFilename();

        totalSales = getTotalSale(filename);
        averageSales = totalSales / NUM_DAY;
        displayTotalSales(totalSales,averageSales);

        System.exit(0);
    }

    public static String getFilename() {
        String filename;
        filename = JOptionPane.showInputDialog("Enter the filename: ");
        return filename;
    }

    public static double getTotalSale(String filename) throws IOException {
        double dailySale;
        double totalSales = 0.0;
        File file = new File(filename);
        Scanner outputFile = new Scanner(file);

        while (outputFile.hasNext()) {
            dailySale = outputFile.nextInt();
            totalSales += dailySale;
        }
        outputFile.close();
        return totalSales;
    }

    public static void displayTotalSales(double totalSales, double avg) {
        JOptionPane.showMessageDialog(null, String.format("The " +
                "total sales is: %d\nThe average sale is: %d ", totalSales, avg));
    }
}
