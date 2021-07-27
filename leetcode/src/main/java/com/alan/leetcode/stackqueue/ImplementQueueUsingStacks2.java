package com.alan.leetcode.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
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
 * @date 2019-04-06
 **/
public class ImplementQueueUsingStacks2 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks2() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ImplementQueueUsingStacks2 queue = new ImplementQueueUsingStacks2();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());   // returns 1
        System.out.println(queue.empty()); // returns false
    }
}
