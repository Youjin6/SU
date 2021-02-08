import java.util.Scanner;

/**
   This program gathers sales amounts for the week.
   It uses the SalesData class to display the total,
   average, highest, and lowest sales amounts.
*/

public class Sales
{
   public static void main(String[] args)
   {
      final int ONE_WEEK = 7; // Number of elements

      // Create an array to hold sales amounts for a week.
      double[] sales = new double[ONE_WEEK];

      // Get the week's sales figures.
      getValues(sales);
	
		// Print the week's sales figures.	
		for (double val : sales)
			System.out.println(val);
   }

   /**
      The getValues method asks the user to enter sales
      amounts for each element of an array.
      @param array The array to store the values in.
   */

   private static void getValues(double[] array)
   {
      //String input;  // To hold user input.
		Scanner keyboard = new Scanner(System.in);

      // Get sales for each day of the week.
      for (int i = 0; i < array.length; i++)
      {
         System.out.print("Enter the sales for day " 
					+ (i + 1) + ".");
			array[i] = keyboard.nextDouble();
      }
   }
}
