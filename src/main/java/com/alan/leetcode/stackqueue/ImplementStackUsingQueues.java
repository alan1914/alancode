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
 *
 * 解题思路
 * 1. 声明一个队列 （注意 java 的队列是个接口 使用它的任意实现即可 这里用的是 LinkedList）
 * 2. 在插入的时候 对队列 翻转 之后所有操作 使用队列操作即可（ 这个时候的队列 已经是逆序了）
 *    push()
 *      插入元素
 *      遍历当前队列 将移除的首元素 放置与 末尾  queue.offer(queue.remove());
 *
 * @author stone
 * @date 2019/1/10/010 14:47
 **/
public class ImplementStackUsingQueues {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.offer(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.offer(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {

        int x = 1;
        ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int param_2 = obj.pop();
        System.out.println(param_2);
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }

}
