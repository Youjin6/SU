package final1;

public class Q8 {
   public static void main(String[] args) {

   }

   public static double sumElements(double[][] array) {
      double sum;
      sum = 0;
      for (int row = 0; row < array.length; row++) {
         for (int col = 0; col < array[row].length; col++) {
            sum += array[row][col];
         }
      }
      return sum;
   }
}
