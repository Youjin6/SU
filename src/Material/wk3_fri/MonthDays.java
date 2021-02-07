package Material.wk3_fri;

public class MonthDays {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March",
                "April", "May", "June", "July",
                "August", "September", "October",
                "November", "December" };

        int[] days = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};

        for (int index = 0; index < month.length; index++) {
            System.out.println(month[index] + " has " + days[index] + " days.");
        }
    }
}
