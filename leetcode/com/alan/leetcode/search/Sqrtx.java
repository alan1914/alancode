package com.alan.leetcode.search;

/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * @author stone
 * @date 2019/2/25/025 10:55
 **/
public class Sqrtx {

    public int mySqrt(int n) {

        int maxTry = 10000;

        double deltaThreshold = 0.000001;

        if (n <= 1) {
            return 0;
        }

        double min = 1.0;
        double max = (double) n;
        for (int i = 0; i < maxTry; i++) {

            double middle = (min + max) / 2;
            double square = middle * middle;
            double delta = Math.abs((square / n) - 1);
            if (delta <= deltaThreshold) {
                return (int) middle;
            } else {
                if (square > n) {
                    max = middle;
                } else {
                    min = middle;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int x = 4;

        Sqrtx sqrtx = new Sqrtx();

        System.out.println(sqrtx.mySqrt(4));
        System.out.println(sqrtx.mySqrt(8));
        System.out.println(sqrtx.mySqrt(6));
        System.out.println(sqrtx.mySqrt(256));
        System.out.println(sqrtx.mySqrt(112));
    }

}
