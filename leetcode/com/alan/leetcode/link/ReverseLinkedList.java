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
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;

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
