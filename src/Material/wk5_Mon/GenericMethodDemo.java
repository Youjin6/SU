package Material.wk5_Mon;

public class GenericMethodDemo {
   public static void main(String[] args) {
      String[] names = {"A", "B", "C"};
      displayArray(names);
      int[] integers = {1, 2, 3, 4};
   }

   public static <E> void displayArray(E[] array) {
      for (E element : array)
         System.out.println(element);
   }
}
