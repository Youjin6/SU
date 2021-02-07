package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SelectionS {
   public static void main(String[] args) throws IOException {
      String filename;
      Scanner keyboard = new Scanner(System.in);
      String[] array = {"An","Unexpected","Party" };
      selectionSort(array);
      for (String a : array){
         System.out.println(a);
      }
   }


   public static String[] selectionSort(String[] array) {
      int minIndex;
      for (int i = 0; i < array.length - 1; i++) {
         minIndex = i;
         for (int j = i + 1; j < array.length; j++) {
            minIndex = array[j].compareTo(array[minIndex]) < 1 ? j :
                  minIndex;
         }
         swap(array, i, minIndex);
      }
      return array;
   }

   public static void swap(String[] arr, int i, int j) {
      String temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

}
