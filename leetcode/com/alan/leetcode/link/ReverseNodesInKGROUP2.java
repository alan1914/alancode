package com.alan.leetcode.link;

import com.alan.leetcode.util.ListNode;

/**
 * @author stone
 * @des
 * @date 2019/1/9/009 17:19
 **/
public class ReverseNodesInKGROUP2 {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        ListNode start = dummy;

        dummy.next = head;

        // 分段

        // 翻转




//        while (true) {
//            ListNode p = start, c, n = p;
//            start = p.next;
//            for (int i = 0; i < k && n != null; i++) {
//                n = n.next;
//            }
//            if (n == null) {
//                break;
//            }
//            for (int i = 0; i < k - 1; i++) {
//                c = p.next;
//                p.next = c.next;
//                c.next = n.next;
//                n.next = c;
//            }
//        }
        return dummy.next;

    }


}
