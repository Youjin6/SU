package temp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalesReport {
   public static void main(String[] args) throws FileNotFoundException {
      final int NUM_DAYS = 30;
      String filename;
      double totalSales;
      double averageSales;

      filename = getFileName();
      totalSales = getTotalSales(filename);
      averageSales = totalSales / NUM_DAYS;
      displayResults(totalSales,averageSales);
   }

   public static String getFileName() {
      String fileName;
      Scanner keyboard = new Scanner(System.in);
      fileName = keyboard.nextLine();

      return fileName;
   }

   public static double getTotalSales(String filename) throws FileNotFoundException {
      double totalSales = 0.0;
      double saleAmount;

      File file = new File(filename);
      Scanner outputFile = new Scanner(file);
      while (outputFile.hasNext()) {
         saleAmount = outputFile.nextInt();
         totalSales += saleAmount;
      }
      return totalSales;
   }

   public static void displayResults(double total, double avg) {
      System.out.printf("The total sale is %d\nThe average is %d.\n", total,
            avg);

   }
}
