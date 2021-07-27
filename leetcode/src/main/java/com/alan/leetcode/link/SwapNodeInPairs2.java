package com.alan.leetcode.link;

import alan.leetcode.util.ListNode;

/**
 * @author stone
 * @des 交换链表的奇偶位
 * @date 2019-04-02
 **/
public class SwapNodeInPairs2 {

    public static ListNode swapPairs(ListNode head) {
        // dummy node
        ListNode dummy = new ListNode(0);

        dummy.next = head;
        // 0->1->2->3->4
        ListNode curr = dummy;

        while(curr.next != null && curr.next.next != null){
            // 1->2->3->4
            ListNode first = curr.next;
            // 2->3->4
            ListNode second = curr.next.next;

            // 1 -> 3 -> 4
            first.next = second.next;
            // 0 -> 2 -> 3 -> 4
            curr.next = second;
            // 0 -> 2 -> 1 -> 3 -> 4
            curr.next.next = first;
            curr = curr.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        listNode2.next = listNode3;
        listNode1.next = listNode2;

        ListNode result = swapPairs(listNode1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }


}
