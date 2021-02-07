package temp;

import java.util.Random;

public class ArrayCopy {
   public static void main(String[] args) {
      final int SIZE = 10;
      int[] array = creatArray(SIZE);

      int[] tripleArray = creatTripleArray(array);

      printArray(array);
      printArray(tripleArray);

   }


   public static int[] creatArray(int size) {
      int[] array = new int[size];

      Random randomNumbers = new Random();

      for (int index = 0; index < size ; index++) {
         array[index] = randomNumbers.nextInt(100) + 1;
      }

      return array;
   }

   public static int[] creatTripleArray(int[] array) {
      int[] tripleArray = new int[array.length];

      for (int index = 0; index < tripleArray.length; index++) {
         tripleArray[index] = array[index] * 3;
      }
      return tripleArray;
   }

   public static void printArray(int[] array) {
      for (int index = 0; index < array.length; index++) {
         System.out.print(array[index] + " ");
      }
      System.out.println();
   }
}
