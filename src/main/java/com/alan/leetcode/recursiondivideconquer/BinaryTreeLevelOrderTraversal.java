package com.alan.leetcode.recursiondivideconquer;

import com.alan.leetcode.util.TreeNode;

import java.util.*;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * solution1
 * BFS
 * <p>
 * DFS
 *
 * @author stone
 * @date 2019/1/15/015 13:53
 **/
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null) {
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> levelValues = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);

                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                levelValues.add(queue.peek().val);
                queue.poll();
            }
            wrapList.add(levelValues);
        }
        return wrapList;
    }


    public static void main(String[] args) {
        //  [3,9,20,null,null,15,7]
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> wrapList = obj.levelOrder(node1);
        System.out.println(wrapList.toString());

    }

}
