package Material.wk2_wed;

/**
 * @author youjin
 */
public class Clock {
    public static void main(String[] args) {
        for (int hours = 1; hours <= 12; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                for (int second = 0; second <= 59; second++) {
                    System.out.printf("%02d:%02d:%02d\n",hours,minutes,second);
                }

            }

        }
    }
}
