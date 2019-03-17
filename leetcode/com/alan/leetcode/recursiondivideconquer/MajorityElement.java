package com.alan.leetcode.recursiondivideconquer;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * <p>
 * 解法一：
 * 暴力：
 * loop： x
 * loop count(x)
 * time O(n^2)
 * <p>
 * 解法二：
 * Map {x,count_x}
 * loop -> map count max
 * time O(n) space O(n)
 * <p>
 * 解法三：
 * sort
 * time O(NlogN)
 * <p>
 * 解法四：
 * divide & conquer
 * time Nlog(n)
 *
 * @author stone
 * @date 2019/1/15/015 8:54
 **/
public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for (int item : nums) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        int maxCount = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        for (Integer item : map.keySet()) {
            if (map.get(item) > maxCount) {
                maxCount = map.get(item);
                result = item;
            }
        }
        if(maxCount >= (nums.length/2)){
            return result;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));

    }


}
