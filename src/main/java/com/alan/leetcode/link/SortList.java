package com.alan.leetcode.link;

/**
 * @author stone
 * @des 链表排序
 * @date 2019/1/3/003 14:07
 **/
public class SortList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    /**
     * 找到中点
     *
     * @param head
     * @return
     */
    public static ListNode findMiddle(ListNode head) {
        ListNode chaser = head;
        ListNode runner = head.next;
        while (runner != null && runner.next != null) {
            chaser = chaser.next;
            runner = runner.next.next;
        }
        return chaser;
    }

    public static ListNode sortList(ListNode head) {
        // 链表为空 或者 只有一个 则返回本身
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode right = sortList(middle.next);
        middle.next = null;
        ListNode left = sortList(head);
        return mergeTwoLists(left, right);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
            } else {
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        if (l1 == null) {
            head.next = l2;
        }
        if (l2 == null) {
            head.next = l1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
        listNode3.next = listNode4;
        listNode2.next = listNode3;
        listNode1.next = listNode2;

        ListNode result = sortList(listNode1);

        System.out.println(result);


    }

}
