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

    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        }

        double deadline = 0.0000001;
        double max = (double) x;
        double min = 1.0;
        int maxTry = 10000;

        for (int i = 0; i < maxTry; i++) {
            double middle = (min + max) / 2;
            double square = middle*middle;
            double delta = Math.abs(square / x -1);
            if (delta <= deadline) {
                return (int) middle;
            } else {
                if (square > x) {
                    max = middle;
                }else{
                    min = middle;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {

        int x = 4;

        Sqrtx sqrtx = new Sqrtx();

        System.out.println(sqrtx.mySqrt(x));
    }

}
