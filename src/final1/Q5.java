package final1;

public class Q5 {
   public static void main(String[] args) {

   }

   public static int binarySearch(double[] array, double value)
   {
      int first;
      int last;
      int middle;
      int position;
      boolean found;

      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      while (!found && first <= last)
      {
         middle = (first + last) / 2;
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         else if (array[middle] > value)
            last = middle - 1;
         else
            first = middle + 1;
      }
      return position;
   }
}
