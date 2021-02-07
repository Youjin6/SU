package Material.wk2_fri;

public class SimpleMethod {
   public static void main(String[] args) {
      int x = 10;
      System.out.println("im passing value to display.");
      displayValue(x);
      displayValue(5);
      displayValue(x * 4);
      displayValue(Integer.parseInt("500"));

   }
   public static void displayValue(int num) {
      System.out.println("The value is: " + num);
   }


}
