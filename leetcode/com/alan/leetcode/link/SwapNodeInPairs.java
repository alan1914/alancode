package com.alan.leetcode.link;

import com.alan.leetcode.util.ListNode;

/**
 * @author stone
 * @des 交换链表的奇偶位
 * @date 2019/1/9/009 14:56
 **/
public class SwapNodeInPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            // 将 第一个节点 的 后继 指向为 第二个节点的后继
            first.next = second.next;
            // 将第二个节点 反转为第一位
            current.next = second;
            // 将第一个节点 放置于第二个节点
            current.next.next = first;
            // 当前节点指向第三个节点
            current = current.next.next;
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
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }



    }


}
