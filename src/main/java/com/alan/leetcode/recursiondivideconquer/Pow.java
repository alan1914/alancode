package com.alan.leetcode.recursiondivideconquer;

/**
 * @author stone
 * @des TODO
 * @date 2019/1/14/014 17:01
 **/
public class Pow {

    public Long myPow(int x, int n) {
        if (n == 0) {
            return 1L;
        }
//        if (n < 0) {
//            return 1 / myPow(x, -n);
//        }
        if (n % 2 == 1) {
            return x * myPow(x, n - 1);
        }
        return myPow(x * x, n / 2);
    }

    public static void main(String[] args) {
        Pow pow = new Pow();
        //获取开始时间
        long startTime = System.currentTimeMillis();
        System.out.println(pow.myPow(2, 31));
        //获取结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");


    }

}
