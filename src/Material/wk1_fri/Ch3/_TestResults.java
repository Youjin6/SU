package Material.wk1_fri.Ch3;


import java.util.Scanner;
/*
 * 注意:
 * 1.这种算成绩的游戏口诀: "大于大的, 小于小的!"
 * 2. import 的写法
 */

/**
   This program asks the user to enter a numeric test
   score and displays a letter grade for the score. The
   program uses an if-else-if statement to determine
   the letter grade.
*/

public class _TestResults
{
   public static void main(String[] args)
   {
      int testScore;    // Numeric test score

      Scanner keyboard = new Scanner(System.in);

      // Get the numeric test score.
      System.out.print("Enter your numeric " +
                     "test score and I will tell you the grade: ");
      testScore = keyboard.nextInt();
      keyboard.nextLine();

      // Display the grade.
      if (testScore < 60)
         System.out.print("Your grade is F.");
      else if (testScore < 70)
         System.out.print("Your grade is D.");
      else if (testScore < 80)
         System.out.print("Your grade is C.");
      else if (testScore < 90)
         System.out.print("Your grade is B.");
      else
         System.out.print("Your grade is A.");

      System.exit(0);
   }
}
