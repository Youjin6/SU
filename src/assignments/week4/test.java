package assignments.week4;

public class test {
    public static void main(String[] args) {
        int[] neg = new int[10];
        int indexNeg = 0;
        int[] odd = new int[10];
        int indexOdd = 0;
        int[] even = new int[10];
        int indexEven = 0;

        int[] arr = {0,1,2,3,4,-1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg[indexNeg++] = arr[i];
            } else if (arr[i] % 2 == 0) {
                odd[indexOdd++] = arr[i];
            } else {
                even[indexEven] = arr[i];
            }
        }
        for(int val : neg) {
            if (val == 0) continue;
            else System.out.println(val);
        }
    }



}
