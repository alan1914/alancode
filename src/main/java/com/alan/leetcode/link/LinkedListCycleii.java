package com.alan.leetcode.link;

/**
 * 题目描述: 链表的入环节点，如果无环，返回null
 * Given a linked list, return the node where the cycle begins. If there is no cycle, returnnull.
 * Follow up: Can you solve it without using extra space?
 * 思路：
 * 1）首先判断是否有环,有环时，返回相遇的节点，无环，返回null
 * 2）有环的情况下， 求链表的入环节点
 *   fast再次从头出发，每次走一步，
 *   slow从相遇点出发，每次走一步，
 *   再次相遇即为环入口点。
 *
 * @author stone
 * @date 2019/1/9/009 15:54
 */
public class LinkedListCycleii {
}
