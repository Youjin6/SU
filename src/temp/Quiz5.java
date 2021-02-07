package temp;

/**
 * The Quiz5 program implements an application that print out numbers
 * to standard output.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class Quiz5 {

    /**
     * Call printNum method 3 times.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        final int ONE = 1; // To hold number 1
        final int TWO = 2; //
        final int THREE = 3;
        printNum(ONE);
        printNum(TWO);
        printNum(THREE);
    }

    /**
     * Print the number to standard output.
     *
     * @param num
     */
    public static void printNum(int num) {
        System.out.println("The number is: " + num);
    }
}

