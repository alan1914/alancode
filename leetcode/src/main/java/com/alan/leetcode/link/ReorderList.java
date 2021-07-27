package com.alan.leetcode.link;

import alan.leetcode.util.ListNode;

/**
 * @author stone
 * @des 重排序链表
 * @date 2019/1/9/009 10:12
 **/
public class ReorderList {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // 快满指针找到中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (slow.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 拆分链表，并反转中间节点之后的链表
        ListNode after = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (after != null) {
            ListNode temp = after.next;
            after.next = pre;
            pre = after;
            after = temp;
        }

        // 合并两个链表
        ListNode first = head;
        after = pre;

        while(first != null && after !=null){
            ListNode ftemp = first.next;
            ListNode aftemp = after.next;
            first.next = after;
            first = ftemp;
            after.next = first;
            after = aftemp;
        }
    }
}
