package Material.wk3_M;

/**
 * 方法里面的变量作用域只有这个方法里面
 */
public class LocalVars {
   public static void main(String[] args) {
      texas();
      california();

   }

   public static void texas() {
      int birds = 500;
      System.out.printf("In texas there are %d birds.\n", birds);

   }

   public static void california() {
      int birds = 3500;
      System.out.printf("In california there are %d birds.\n", birds);

   }
}
