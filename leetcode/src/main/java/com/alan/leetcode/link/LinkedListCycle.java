package com.alan.leetcode.link;

import alan.leetcode.util.ListNode;

/**
 * 题目：LinkedListCycle 判断链表是否有环
 * Given a linked list, determine if it has a cycle in it.
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
 * in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 * 解题思路
 * 1.硬做 直接循环，定义一个时间值，例如0.5s 如果没结束就认为有环
 * 2.Set 集合 判重 O(n)
 * 3.快慢指针 O(n)
 *
 * @author stone
 * @date 2019/1/9/009 15:54
 **/
public class LinkedListCycle {

    /**
     * 这里使用解法3 快慢指针方法
     * 如果 快指针 指向的节点 等于 慢指针 指向的节点 则说明有环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


}
