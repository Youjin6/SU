package Material.wk3_fri;

public class ReturnArray {
    public static void main(String[] args) {
        double[] values;
        values = getArray();
        for (double num : values) {
            System.out.println(num + " ");
        }
    }

    public static double[] getArray() {
        double[] array = {1.2, 2.3, 4.5, 6.7, 8.9};

        return array;
    }
}
