package Fundamentals.BasicProgrammingModel.exercise;

import edu.princeton.cs.algs4.StdOut;

public class ex116 {
    public static void main(String[] args) {
        // 练习1.1.6-下面这段程序会打印出什么？
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}

/*
*
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
*
*
* */