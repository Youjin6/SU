package temp;

public class Test {
   public static String addOne(String val) {
      return val + 1;
   }
   public static void main(String[] args) {
      String x = "1";
      x = addOne(x);
      x = addOne(x);
      System.out.println(x);
   }
}