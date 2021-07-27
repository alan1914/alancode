package com.alan.leetcode.mapset;

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
 *    for x: 0~9
 *       set: 9 - x
 * java解题思路
 * 注意这里题目要求返回下标 ，所以 改用map了
 *
 * @author stone
 * @date 2019/1/11/011 15:31
 **/
public class TwoSum {

    // 返回符合条件值
    // 注意这里要求返回下标 所以改用 map了
    public int[] twoSumReturnValue(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            set.remove(nums[i]);
            boolean bool = set.add(target - nums[i]);
            if (!bool) {
                int[] result = {nums[i], target - nums[i]};
                return result;
            }
            set.add(nums[i]);
        }
        return null;
    }

    public int[] twoSumReturnIndex(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if(map.containsKey(y) && map.get(y) != i){
                int[] result = {i,map.get(y)};
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
        int[] nums = {3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
//        int[] reslut = twoSum.twoSumReturnValue(nums, target);
//        System.out.println(Arrays.toString(reslut));
        int[] reslut2 = twoSum.twoSumReturnIndex(nums, target);
        System.out.println(Arrays.toString(reslut2));
    }

}
