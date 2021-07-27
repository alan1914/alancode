package com.alan.leetcode.stackqueue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 239. Sliding Window Maximum
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position. Return the max sliding window.
 * <p>
 * 解法一. MaxHeap
 * a.维护 heap  (log k)
 * b. max -> top (O(1))
 * 最终 time (N*logk)
 * <p>
 * 解法二. Queue -> deque(双端队列) 下面用的是解法二
 * a.入队列
 * b.维护
 * 最终 time O(n)
 * <p>
 * 解法二 java 思路
 * 遍历 数组
 * 第一步 循环 将超出当前window 的元素移除
 * 第二步 循环 将当前window 内小于比较值的队尾元素移除 直至当前window为空 或者 window内的值比待插入值小
 * 第三步 插入当前值的索引在队列中
 * 第四步 判断当前索引是否已经大于 window的大小 如果大于 则开始插入队首元素到 结果数组中
 * 返回结果
 *
 * @author stone
 * @date 2019/1/11/011 10:16
 **/
public class SlidingWindowMaximum3 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        // 边缘检测
        if (nums.length == 0) {
            return new int[0];
        }


        // 内部变量
        int[] resultArr = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int resultIndex = 0;


        // 循环
        // 核心 队列存储的是索引 而非值
        for (int i = 0; i < nums.length; i++) {
            // 将不属于范围的元素删除
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.remove();
            }

            // 判断当前队尾元素是否小于待插入值 则移除
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);
            // 获取队头元素 放入返回数组中
            if (i >= k - 1) {
                resultArr[resultIndex++] = nums[deque.peek()];
            }
        }

        return resultArr;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
//        int k = 3;
//        int[] arr = {1, 3, 1, 2, 0, 5};
//        int k = 3;
//        SlidingWindowMaximum3 slidingWindowMaximum = new SlidingWindowMaximum3();
//        int[] result = slidingWindowMaximum.maxSlidingWindow(arr, k);
//        System.out.println(Arrays.toString(result));

        System.out.println(9/2);
        System.out.println(9%2);

    }
}
