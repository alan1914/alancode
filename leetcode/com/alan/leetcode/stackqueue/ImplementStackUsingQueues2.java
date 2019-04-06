package com.alan.leetcode.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目  Implement Stack using Queues
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * <p>
 * 解题思路
 * 1. 声明一个队列 （注意 java 的队列是个接口 使用它的任意实现即可 这里用的是 LinkedList）
 * 2. 在插入的时候 对队列 翻转 之后所有操作 使用队列操作即可（ 这个时候的队列 已经是逆序了）
 * push()
 * 插入元素
 * 遍历当前队列 将移除的首元素 放置与 末尾  queue.offer(queue.remove());
 *
 * @author stone
 * @date 2019-04-06
 **/
public class ImplementStackUsingQueues2 {

    Queue<Integer> queue = new LinkedList<Integer>();

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues2() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.remove());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        if (queue.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int x = 1;
        ImplementStackUsingQueues2 stack = new ImplementStackUsingQueues2();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty());   // returns false
    }

}
