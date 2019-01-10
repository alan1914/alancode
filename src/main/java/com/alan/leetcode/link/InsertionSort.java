package com.alan.leetcode.link;

import java.util.List;

/**
 * @author stone
 * @des TODO
 * @date 2019/1/4/004 16:42
 **/
public class InsertionSort {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    public static ListNode insertionSortList(ListNode head) {

        ListNode result = new ListNode(0);
        // 当前链表
        ListNode curNode = head;
        // 临时链表
        ListNode preNode = result;
        while(curNode != null){
            // 指向下一个
            ListNode next = curNode.next;
            preNode = result;
            // 如果临时链表没有子节点 并且 临时链表的第一个 小于当前链表的第一个的值
            // 就接着遍历下一个 直到找到 待插入的节点的正确位置
            while(preNode.next!=null && preNode.next.val < curNode.val) {
                preNode = preNode.next;
            }
            curNode.next = preNode.next;
            preNode.next = curNode;
            curNode = next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        listNode2.next = listNode3;
        listNode1.next = listNode2;

        while (listNode1.next == null){
            ListNode temp = listNode1.next;
            System.out.print(listNode1.val);
        }
        ListNode result = insertionSortList(listNode1);

        System.out.println(result);
    }


//        if (head == null) {
//        return null;
//    }
//
//    ListNode dumy = new ListNode(0);
//    ListNode preNode = dumy;
//    ListNode currentNode = head;
//        while (currentNode == null) {
//        // 保存当前节点下一个节点
//        ListNode next = currentNode.next;
//        preNode = dumy;
//        // 寻找当前节点正确位置的一个节点
//        while (preNode.next != null && preNode.next.val < currentNode.val) {
//            preNode = preNode.next;
//        }
//        // 将当前节点加入新链表中
//        currentNode.next = preNode.next;
//        preNode.next = currentNode;
//        // 处理下一个节点
//        currentNode = next;
//    }
//        return dumy.next;

//    ListNode dumy = new ListNode(Integer.MIN_VALUE);
//    ListNode cur = head;
//    ListNode pre = dumy;
//        while (cur != null) {
//        //保存当前节点下一个节点
//        ListNode next = cur.next;
//        pre = dumy;
//        //寻找当前节点正确位置的一个节点
//        while (pre.next != null && pre.next.val < cur.val) {
//            pre = pre.next;
//        }
//        //将当前节点加入新链表中
//        cur.next = pre.next;
//        pre.next = cur;
//        //处理下一个节点
//        cur = next;
//    }
//        return dumy.next;

}
