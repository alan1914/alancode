package com.alan.leetcode.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 239. Sliding Window Maximum
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position. Return the max sliding window.
 *
 * 解法一. MaxHeap
 * a.维护 heap  (log k)
 * b. max -> top (O(1))
 * 最终 time (N*logk)
 *
 * 解法二. Queue -> deque(双端队列) 下面用的是解法二
 * a.入队列
 * b.维护
 * 最终 time O(n)
 *
 * 解法二 java 思路
 * 遍历 数组
 *    第一步 循环 将超出当前window 的元素移除
 *    第二步 循环 将当前window 内小于比较值的队尾元素移除 直至当前window为空 或者 window内的值比待插入值小
 *    第三步 插入当前值的索引在队列中
 *    第四步 判断当前索引是否已经大于 window的大小 如果大于 则开始插入队首元素到 结果数组中
 * 返回结果
 * @author stone
 * @date 2019/1/11/011 10:16
 **/
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || k <= 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        Deque<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            // 超过范围的元素移除
            while (!q.isEmpty() && q.peek() < i - k + 1 ) {
                q.poll();
            }
            // 队列尾部小于 当前值的 元素移除，依次循环
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offerLast(i);
            //
            if (i >= k - 1) {
                result[resultIndex++] = nums[q.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
//        int k = 3;
        int[] arr = {1,-1};
        int k = 1;
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] result = slidingWindowMaximum.maxSlidingWindow(arr, k);
        for (int item : result) {
            System.out.println(item);
        }
    }
}
