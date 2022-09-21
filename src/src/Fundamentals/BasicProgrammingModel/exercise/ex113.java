package Fundamentals.BasicProgrammingModel.exercise;

import edu.princeton.cs.algs4.StdOut;

public class ex113 {
    public static void main(String[] args) {
        // 练习1.1.3-编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal ，否则打印 not equal。
        if (args.length != 3) {
            StdOut.println("Usage: E10103 <num1> <num2> <num3>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if (num1 == num2 && num1 == num3)
        {
            StdOut.println("equal");
        } else
        {
            StdOut.println("not equal");
        }
    }
}
