package Material.wk2_mon;

/*
 * 3.6 Comparing String Object
 *
 * ===1 equals===
 * StringA.equals(StringB)      -> return boolean
 *
 * ===2 equals("")===
 * if (StringA.equals("wanghaha") {}        --> return boolean
 * if (!StringA.equals("wanghaha") {}
 *
 * ===3 compareTo===
 * if (StringA.compareTo(String B) == 0) {
 * } else if (StringA.compareTo(StringB) > 0) { // a > b
 * } else if (StringA.compareTo(StringB) < 0) { // a < b
 * }
 * NOTE: 字典序ASCII code
 * ===4 equalsIgnoreCase===
 * StringA.equalsIgnoreCase(StringB)
 * StringA.equalsIgnoreqCase(StringB)
 *
 */

/**
 * This
 *
 * @author youjin
 * @version 1.0
 */
public class StringEquals {
    public static void main(String[] args) {
        String name1 = "Mark";
        String name2 = "Mark";
        String name3 = "Mary";

        // Compare "Mark" and "Mark"
        if (name1.equals(name2)) {
            System.out.println(name1 + " and " + name2 + " are the same");
        } else {
            System.out.println(name1 + " and " + name2 + " are NOT the same");
        }

        if (name1.equals(name3)) {
            System.out.println(name1 + " and " + name3 + " are the same");
        } else {
            System.out.println(name1 + " and " + name3 + " are NOT the same");
        }
    }

}
