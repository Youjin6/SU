package Material.wk3_M;

public class ValueReturn {
   public static void main(String[] args) {
      int total, value1 = 20, value2 = 40;
      total = sum(value1, value2);
      System.out.printf("The sum of %d and %d is %d", value1,value2,total);
   }

   public static int sum(int number1, int number2) {
      int result;
      result = number1 + number2;
      return result;
   }
}
