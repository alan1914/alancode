package com.alan.leetcode.link;

import com.alan.leetcode.util.ListNode;

/**
 * 206 Reverse Linked List
 *
 * Reverse a singly linked list.
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 */
public class ReverseLinkedList2 {

    public static ListNode reverseList(ListNode head) {
        // valid
        if(head == null || head.next == null){
            return head;
        }

        // temp 节点
        ListNode pre = null;
        // current node
        ListNode curr = head;
        while(curr!= null){
            ListNode teamNode = curr.next;
            // 将当前节点的下一个节点 指向上一个节点
            curr.next = pre;
            pre = curr;
            curr = teamNode;
        }

        return pre;

    }

    public static void main(String[] args) {

        //  Input: 1->2->3->4->5->NULL
        //  Output: 5->4->3->2->1->NULL

        ListNode root = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        root.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        ListNode result = reverseList(root);

        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

}
