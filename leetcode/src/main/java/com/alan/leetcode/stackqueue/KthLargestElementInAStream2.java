package com.alan.leetcode.stackqueue;

import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums,
 * which contains initial elements from the stream. For each call to the method KthLargest.add,
 * return the element representing the kth largest element in the stream.
 * <p>
 * 解题思路
 * 1.声明一个优先队列 (java 优先队列的头是基于自然排序或者Comparator排序的最小元素。)
 * 2.传入常数k 和 数组
 * 遍历数组
 * 如果 当前优先队列的长度小于 k 则将数组中元素都 添加进 队列中
 * 如果 否则如果 遍历值的大小 大于队列顶部元素 则插入队列
 * 3.输出 当前优先队列 peek() 即第K大元素
 *
 * @author stone
 * @date 2019/1/10/010 17:23
 **/
public class KthLargestElementInAStream2 {

    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int k = 0;


    public KthLargestElementInAStream2(int k, int[] nums) {
        this.k = k;
        for (int item : nums) {
            add(item);
        }
    }

    public int add(int val) {
        if (queue.size() < this.k) {
            queue.add(val);
        }else if (queue.peek() < val) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
//        int k = 3;
//        int[] arr = {0,5, 4, 8, 2};
//        KthLargestElementInAStream2 kthLargest = new KthLargestElementInAStream2(3, arr);
//        System.out.println(kthLargest.add(3));// returns 4
//        System.out.println(kthLargest.add(5));   // returns 5
//        System.out.println(kthLargest.add(10));  // returns 5
//        System.out.println(kthLargest.add(9));   // returns 8
//        System.out.println(kthLargest.add(4));   // returns 8

        int k = 1;
        int[] arr = {};
        KthLargestElementInAStream2 kthLargest = new KthLargestElementInAStream2(k, arr);
        System.out.println(kthLargest.add(-3));  // -3
        System.out.println(kthLargest.add(-2));  // -2
        System.out.println(kthLargest.add(-4));  // -2
        System.out.println(kthLargest.add(0));   // 0
        System.out.println(kthLargest.add(4));   // 4
    }


}
