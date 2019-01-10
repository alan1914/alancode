package com.alan.leetcode.stackqueue;

import java.util.Stack;

/**
 * 题目  Implement Queue using Stacks
 * Implement the following operations of a queue using stacks.
 *   push(x) -- Push element x to the back of queue.
 *   pop() -- Removes the element from in front of queue.
 *   peek() -- Get the front element.
 *   empty() -- Return whether the queue is empty.
 *
 * 解题思路
 * 1. 声明两个整数型栈 一个 input 一个 output （这里题目要求返回int 则push的值都为 Integer）
 * 2. push() 就给 input.push()
 * 3. peek() 就
 *    判断当前output 是否为空
 *    如果为空 就循环push input中的元素 这样两次入栈 就是一个队列的顺序了。
 *       核心代码 output.push(input.pop());
 *    不为空 就输出output栈的第一个元素
 * 4. pop() 先找到顶部元素 peek() 然后 出栈就行了
 * 5. empty() 判断 两个栈是否都为空
 * over
 *
 * @author stone
 * @date 2019/1/10/010 14:04
 **/
public class ImplementQueueUsingStacks {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        input.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return output.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {

        int x = 1;
        ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
        obj.push(x);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}
