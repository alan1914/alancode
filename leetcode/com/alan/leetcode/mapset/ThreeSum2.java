package com.alan.leetcode.mapset;

import java.util.*;

/**
 * 15. 3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 解法一：
 * 暴力 O(n^3)
 * <p>
 * 解法二：
 * c = - (a + b) -> Set O(1)
 * a,b -> 2 lops O(n^2)
 * time O(n^2)  space O(n)
 * <p>
 * 解法三：
 * Sort Find: Array, sort O(NlogN)
 * loop: a
 * a + b + c > 0
 * a + b + c < 0
 * time O(n^2)  space 0
 *
 * @author stone
 * @date 2019/1/11/011 16:18
 **/
public class ThreeSum2 {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList();
        }
        List<List<Integer>> resultList = new ArrayList();
        // 数组进行排序
        Arrays.sort(nums);
        int x, y, z;
        for (int i = 0; i < nums.length - 1; i++) {
            // 过滤重复元素
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            Map<Integer, Integer> targetMap = new HashMap<>(16);
            for (int j = i + 1; j < nums.length; j++) {
                x = nums[i];
                y = nums[j];
                z = -(nums[i] + nums[j]);
                if (targetMap.containsKey(nums[j])) {
                    if (targetMap.get(nums[j]) == 1) {
                        resultList.add(Arrays.asList(x, y, z));
                        // 使用过 减1
                        targetMap.put(nums[j], 0);
                    }
                } else {
                    targetMap.put(z, 1);
                }
            }
        }
        return resultList;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {0, 0, 0};
        ThreeSum2 threeSum = new ThreeSum2();
        List<List<Integer>> list = threeSum.threeSum(nums);
        System.out.println(Arrays.toString(list.toArray()));

    }

}
