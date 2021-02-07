package Material.wk2_mon;
/*
* 注意:
*  %,.2f
*  诡异的 逗号冒号连着写
*
* */
/**
 * @author youjin
 */
public class CurrencyFormat {
    public static void main(String[] args) {
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;

        System.out.printf("Your annual pay is %,.2f",annualPay );

    }
}
