package Material.wk1_fri.Ch3;

import java.util.Scanner;

/**
   This program demonstrates the logical || operator.
*/

public class LogicalOr
{
   public static void main(String[] args)
   {
      double salary;       // Annual salary
      double yearsOnJob;   // Years at current job

      Scanner keyboard = new Scanner(System.in);

      // Get the user's annual salary.
      System.out.print("Enter your annual salary.");
      salary = keyboard.nextDouble();

      // Get the number of years at the current job.
      System.out.print("Enter the number of " +
                                    "years at your current job.");
      yearsOnJob = keyboard.nextDouble();

      // Determine whether the user qualifies for the loan.
      if (salary >= 30000 || yearsOnJob >= 2)
      {
            System.out.print("You qualify for the loan.");
      }
      else
      {
            System.out.print("You do not qualify for the loan.");
      }

      System.exit(0);
   }
}
