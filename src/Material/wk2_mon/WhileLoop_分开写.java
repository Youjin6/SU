package Material.wk2_mon;
/*
 * 注意:
 * 1. while 的 初始条件, 循环条件, 更新 i 是过分开的
 *
 * */

/**
 * @author youjin
 */
public class WhileLoop_分开写 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            System.out.printf("Hello   " + "第 %d 次输出", i);
            System.out.println();
            i++;
        }
    }
}
