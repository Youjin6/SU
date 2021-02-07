package Material.wk3_M;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SalesReport {
   public static void main(String[] args) throws IOException {
      final int NUM_DAYS = 30;
      String filename;
      double totalSales;
      double averageSales;

      // Get the name of file
      filename = getFileName();

      // Get the total sales from the file
      totalSales = getTotalSale(filename);

      // Calculate the average
      averageSales = totalSales / NUM_DAYS;

      // Display the total and average
      displayResults(totalSales,averageSales);

      System.exit(0);


   }

   /**
    * The getFile method prompts the user to enter the name of the file to open
    *
    * @return A reference to a String object containing the name of the file.
    */
   public static String getFileName() {
      String file;
      file = JOptionPane.showInputDialog("Enter the name of the file\n");
      // return the name
      return file;
   }

   /**
    * The getTotalSales method opens a file and reads the daily sales
    * amounts, accumulating the total. The total is returned
    *
    * @param filename The name of file to open
    * @return The total of the sales amounts.
    * @throws IOException
    */
   public static double getTotalSale(String filename) throws IOException {
      double total = 0.0;  //Accumulator
      double sales;  // A daily sales amount

      // open the file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      while (inputFile.hasNext()) {
         sales = inputFile.nextDouble();

         total += sales;
      }
      inputFile.close();
      return total;

   }

   public static void displayResults(double total, double avg) {
      JOptionPane.showMessageDialog(null,
            String.format("The total sales for the period is $%,.2f\n" + "The" +
                  " average daily sales were $%,.2f",total,avg));

   }


}
