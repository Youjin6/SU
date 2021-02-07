package finalPrep;

public class Q1 {
   /**
    * Prints the multiplication table (with row and
    * column headings) from 1 to num
    *
    * @param num the number of rows/columns
    */
   public static void printMultiplicationTable(int num) {
      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= num; j++) {
            System.out.println(i * j + " ");
         }
      }
   }
}
