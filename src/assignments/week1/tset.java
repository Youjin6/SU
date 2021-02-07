package assignments.week1;

public class tset {
    public static void main(String[] args) {
        int x = 10, y = 12, r;
        if (y > x) {
            int t = y;
            y = x;
            x = t;
        }

        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        System.out.println(x);
    }
}
