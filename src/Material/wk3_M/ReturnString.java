package Material.wk3_M;

/**
 * 字符串可以用 "+" 拼接
 */
public class ReturnString {
   public static void main(String[] args) {
      String customerName;
      customerName = fullName("Youjin", "Li");
      System.out.println(customerName);
   }

   public static String fullName(String first, String last) {
      String name;
      name = first + " " + last;
      return name;
   }
}
