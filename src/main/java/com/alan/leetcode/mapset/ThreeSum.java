package com.alan.leetcode.mapset;

import java.util.List;

/**
 * 15. 3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 解法一：
 * 暴力 O(n^3)
 *
 * 解法二：
 * c = - (a + b) -> Set O(1)
 * a,b -> 2 lops O(n^2)
 * time O(n^2)  space O(n)
 *
 * 解法三：
 * Sort Find: Array, sort O(NlogN)
 *  loop: a
 *    a + b + c > 0
 *    a + b + c < 0
 *  time O(n^2)  space 0
 *
 * @author stone
 * @date 2019/1/11/011 16:18
 **/
public class ThreeSum {
//    public List<List<Integer>> threeSum(int[] nums) {
//
//
//
//
//    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
    }

}
