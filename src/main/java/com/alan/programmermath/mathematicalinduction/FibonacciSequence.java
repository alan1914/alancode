package com.alan.programmermath.mathematicalinduction;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/20/020 9:18
 **/
public class FibonacciSequence {

    /**
     * 斐波那契数列 （递归实现）
     *
     * @return
     */
    public static int fribonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fribonacci(n - 1) + fribonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = fribonacci(9);
        System.out.printf("%d", result);
    }
}
