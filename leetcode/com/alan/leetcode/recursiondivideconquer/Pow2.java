package com.alan.leetcode.recursiondivideconquer;

/**
 * @author stone
 * @date 2019-04-20
 **/
public class Pow2 {



    public double myPow(double x, long n) {

        if (n == 0) {
            return 1;
        }

        // 如果是倒数
        if (n < 0) {
            n = -n;
            // 注意这里原来传入的参数是int 类型的
            // 但如果我们传入 -2147483648 2^-31 这里会越界
            // java 会返回 Infinity
            x = 1/x;
        }

        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);

    }

    public static void main(String[] args) {
        Pow2 pow = new Pow2();
        //获取开始时间
        long startTime = System.currentTimeMillis();
        System.out.println(pow.myPow(2.0, -2147483648));
        System.out.println(9/2);
        //获取结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");


    }

}
