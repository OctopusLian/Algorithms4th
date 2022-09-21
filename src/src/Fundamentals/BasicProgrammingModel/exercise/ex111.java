package Fundamentals.BasicProgrammingModel.exercise;

import edu.princeton.cs.algs4.StdOut;

public class ex111 {
    public static void main(String[] args) {
        // 练习1.1.1-给出以下表达式的值
        int a = ( 0 + 15 ) / 2;
        float b = (float) (2.0e-6 * 100000000.1);
        boolean c = true && false || true && true;
        StdOut.println(a);  // 7
        StdOut.println(b);  // 200.0
        StdOut.println(c);  // true
    }
}
