package com.alan.leetcode.interview;

/**
 * 204. Count Primes
 * 统计素数（质数）数量
 * 这是一道我在华中云盛 碰到的算法题 面试官当场口述问的
 *
 * @author stone
 * @date 2019-04-28
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(100));
    }

}
