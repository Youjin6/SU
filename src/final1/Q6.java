package final1;

public class Q6 {
   public static void main(String[] args) {
      int[] arr = new int[0];
      System.out.println(isUnique(arr));
   }

   public static boolean isUnique(int[] array) {
      boolean unique = true;
      if (array.length == 0 || array.length == 1) {
         unique = true;
      }

      for (int i = 0; i < array.length; i++) {
         for (int j = i + 1; j < array.length; j++) {
            if (array[j] == array[i]) {
               unique = false;
            }
         }
      }
      return unique;
   }
}
