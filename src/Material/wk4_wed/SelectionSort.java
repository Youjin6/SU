package Material.wk4_wed;

import java.util.Random;

public class SelectionSort {
   public static void main(String[] args) {
      Random random = new Random();
      int[] array = new int[10];
      for (int index = 0; index < 10; index++) {
         array[index] = random.nextInt(100) + 1;
      }

      System.out.print("unsorted array: ");
      for (int val : array) {
         System.out.print(val + " ");
      }
      selectionSort(array);
      System.out.println();
      System.out.print("Sorted array: ");
      for (int val : array) {
         System.out.print(val + " ");
      }
   }

   public static void selectionSort(int[] array) {
      int minIndex;
      for (int i = 0; i < array.length - 1; i++) {
         minIndex = i;
         for (int j = i + 1; j < array.length; j++) {
            minIndex = array[j] < array[minIndex] ? j : minIndex;
         }
         swap(array, i, minIndex);
      }
   }

   public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
