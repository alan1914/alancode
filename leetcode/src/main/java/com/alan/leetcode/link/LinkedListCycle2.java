package com.alan.leetcode.link;

import alan.leetcode.util.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 题目：LinkedListCycle 判断链表是否有环
 * Given a linked list, determine if it has a cycle in it.
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
 * in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * <p>
 * 解题思路
 * 1.硬做 直接循环，定义一个时间值，例如0.5s 如果没结束就认为有环
 * 2.Set 集合 判重 O(n)
 * 3.快慢指针 O(n)
 *
 * @author stone
 * @date 2019/1/9/009 15:54
 **/
public class LinkedListCycle2 {

    // solution2 set 集合
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    // solution2 快慢指针
    public static boolean hasCycle2(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (slow !=null && fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.equals(fast)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;

        System.out.println(hasCycle2(listNode1));

    }


}
