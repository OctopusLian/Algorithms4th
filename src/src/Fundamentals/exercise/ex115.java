package Fundamentals.exercise;

import edu.princeton.cs.algs4.StdOut;
public class ex115 {
    public static void main(String[] args) {
        // 编写一段程序，如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true ，否则打印 false
        double a = 1.5;
        double b = 0.8;

        if (a >= 0 && a <= 1) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }

        if (b >= 0 && b <= 1) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }
    }
}
