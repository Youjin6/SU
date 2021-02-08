package final1;

public class Q1 {
   public static void main(String[] args) {
      int[] arr = {7, 4, 8, 6, 2};


      for (int i = 1; i < arr.length; i++) {
         arr[i] = i + arr[i - 1] - arr[i];
      }

      for (int i : arr) {
         System.out.println(i);
      }
   }
   public static void method() {

   }

   /**
    * The printNumber method prints a number.
    */
   public static int printNumber(int num) {
      System.out.println(num);
      return num;
   }
}
