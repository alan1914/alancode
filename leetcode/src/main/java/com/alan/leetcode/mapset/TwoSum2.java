package com.alan.leetcode.mapset;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * 解法一
 * 暴力 O(n^2)
 * <p>
 * 解法二
 * Set x + y = 9 -> y = 9 - x
 * for x: 0~9
 * set: 9 - x
 * java解题思路
 * 注意这里题目要求返回下标 ，所以 改用map了
 *
 * @author stone
 * @date 2019-03-30
 **/
public class TwoSum2 {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length <= 1) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i], i);
        }

        // y = 9 - x
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i] ;
            if(map.containsKey(y) && !map.get(y).equals(i)){
                int[] result = {i,map.get(y)};
                return result;
            }

        }

        return null;
    }


    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        TwoSum2 twoSum2 = new TwoSum2();
        int[] resultNum = twoSum2.twoSum(nums, target);
        System.out.println(Arrays.toString(resultNum));

    }

}
