package project;

import java.util.Scanner;

/**
 * This Depreciation program implements an application that display the
 * depreciated value of office equipment.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class Depreciation {
   /**
    * Call welcome, showDepreciationInformation and goodbye function.
    *
    * @param args A string array containing the command line arguments.
    */
   public static void main(String[] args) {
      // Creat a Scanner object
      Scanner keyboard = new Scanner(System.in);

      // Call welcome
      welcome();

      // Call showDepreciationInformation
      execute(keyboard);

      // Call goodbye
      goodbye();

      // Close Scanner
      keyboard.close();
   }

   /**
    * Show welcome message.
    */
   public static void welcome() {
      System.out.println("\nWelcome to the asset depreciation reporting " +
            "system, brought to you by \n" + "Slime, Weasel, and Swindle." +
            " (add more info about what the program does!)\n");
   }

   /**
    * Show goodbye message.
    */
   public static void goodbye() {
      System.out.println("Goodbye and thanks for using Depreciation!");
   }

   /**
    * Get a description of equipment from the users.
    *
    * @param keyboard A Scanner
    * @return A Description of the equipment.
    */
   public static String getDescription(Scanner keyboard) {
      String description;  // To hold description

      // Prompts users for a description
      System.out.print("Enter a description of the property: ");
      description = keyboard.nextLine();

      return description;
   }

   /**
    * Get the beginning value of equipment from the users.
    *
    * @param keyboard A Scanner
    * @return A beginning value of the equipment
    */
   public static double getBeginningValue(Scanner keyboard) {
      double beginningValue;  // To hold the beginning value;

      // Prompts users for the beginning value
      System.out.print("What is the original value of the equipment? $");
      beginningValue = keyboard.nextDouble();

      return beginningValue;
   }

   /**
    * Get the yearly depreciation value of equipment from the users.
    *
    * @param keyboard A Scanner
    * @return the yearly depreciation value of equipment
    */
   public static double getDepreciation(Scanner keyboard) {
      double depreciation;  // To hold the depreciation

      // Prompts users for the yearly depreciation of equipment.
      System.out.print("What is the annual depreciation? $");
      depreciation = keyboard.nextDouble();

      // format the output
      keyboard.nextLine();
      System.out.println();

      return depreciation;
   }

   /**
    * Print out the information of the equipment to the standard output.
    *
    * @param description    A description of equipment
    * @param beginningValue The beginning value of the equipment
    * @param depreciation   The yearly depreciation of the equipment
    */
   public static void printInformation(String description,
                                       double beginningValue,
                                       double depreciation) {
      System.out.printf("Equipment description: %s\n", description);
      System.out.printf("Beginning value: $%,.2f\n", beginningValue);
      System.out.printf("Depreciation: $%,.2f\n\n", depreciation);
   }

   /**
    * Calculate and display the depreciation, end of year value and
    * accumulated depreciation to standard output.
    *
    * @param beginningValue The beginning value of the equipment
    * @param depreciation   The depreciation of the equipment
    */
   public static void calculateDepreciation(double beginningValue,
                                            double depreciation) {
      double endOfYearValue;           // To hold the end of year value
      double accumulatedDepreciation;  // To hold the accumulated depreciation
      int countYear;                      // To hold the number of year
      final double ZERO = 0.0;            // To hold the constant number 0
      final String DOLLAR_SYMBOL = "$";   // To hold the dollar symbol
      final String YEAR = "Year";         // To hold the string year
      // To hold the String depreciation
      final String DEPRECIATION = "Depreciation";
      // To hold the String end of year value.
      final String END_OF_YEAR_VALUE = "End-of-Year Value";
      // To hold the String accumulated depreciation
      final String ACCUMULATED_DEPRECIATION = "Accumulated Depreciation";

      // To show the tags
      System.out.printf("%-9s%-17s%-22s%s\n", YEAR, DEPRECIATION,
            END_OF_YEAR_VALUE, ACCUMULATED_DEPRECIATION);

      // initialize the year
      countYear = 1;

      // To calculate the end of year value
      endOfYearValue = beginningValue - depreciation;

      // To initialize the accumulated depreciation
      accumulatedDepreciation = depreciation;

      // Display the depreciation, end of year value and accumulated
      // depreciation for each year.
      while (endOfYearValue >= 0) {
         System.out.printf("%2d%8s%,9.2f%8s%,10.2f%12s%,10.2f\n",
               countYear, DOLLAR_SYMBOL, depreciation, DOLLAR_SYMBOL,
               endOfYearValue, DOLLAR_SYMBOL, accumulatedDepreciation);
         countYear++;
         endOfYearValue -= depreciation;
         accumulatedDepreciation += depreciation;
      }

      // Update en of year value
      endOfYearValue += depreciation;

      // Print the remaining value
      if (endOfYearValue > 0) {
         System.out.printf("%2d%8s%,9.2f%8s%,10.2f%12s%,10.2f\n",
               countYear, DOLLAR_SYMBOL, endOfYearValue, DOLLAR_SYMBOL, ZERO,
               DOLLAR_SYMBOL, beginningValue);
      }
   }
   /**
    * Call getDescription, getBeginningValue, getDepreciation,
    * calculateDepreciation and getIfRepeat functions and show the depreciation
    * information
    *
    * @param keyboard A Scanner
    */
   public static void showDepreciationInformation(Scanner keyboard) {
      String description;        // To hold description
      double beginningValue;     // To hold beginning value of equipment
      double depreciation;       // To hold yearly depreciation value

      // Call getDescription
      description = getDescription(keyboard);

      // Call getBeginningValue
      beginningValue = getBeginningValue(keyboard);

      // Call getDepreciation
      depreciation = getDepreciation(keyboard);

      // Call printInformation
      printInformation(description, beginningValue, depreciation);

      // Call calculateDepreciation
      calculateDepreciation(beginningValue, depreciation);
   }

   /**
    * Ask users if they want to depreciate another item.
    *
    * @param keyboard A Scanner
    * @return Yes or no
    */
   public static char getIfRepeat(Scanner keyboard) {
      String input; // To hold the input from users
      char repeat;  // To hold yes or no

      // Ask user if they want to repeat the program
      System.out.print("\nDo you want to depreciate another item (y/n)?" +
            " ");
      input = keyboard.nextLine();
      repeat = input.charAt(0);
      System.out.println();

      return repeat;
   }

   /**
    * Execute the program as many times as users want.
    *
    * @param keyboard A Scanner
    */
   public static void execute(Scanner keyboard) {
      char repeat; // To hold yes or no
      do {
         showDepreciationInformation(keyboard);
         repeat = getIfRepeat(keyboard);
      } while (repeat == 'y' || repeat == 'Y');
   }
}
