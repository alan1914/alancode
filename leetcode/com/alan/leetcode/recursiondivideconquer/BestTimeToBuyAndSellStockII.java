package com.alan.leetcode.recursiondivideconquer;

/**
 * Best Time to Buy and Sell Stock II
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * solution1:
 * DFS
 * 买1股
 * 卖1股
 * O(n^2)
 * <p>
 * solution2
 * Greedy
 * time O(n)
 * <p>
 * solution3
 * DP
 * time O(n)
 *
 * @author stone
 * @date 2019/1/15/015 9:29
 **/
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1 ] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStockII obj = new BestTimeToBuyAndSellStockII();
        System.out.println(obj.maxProfit(prices));
    }

}
