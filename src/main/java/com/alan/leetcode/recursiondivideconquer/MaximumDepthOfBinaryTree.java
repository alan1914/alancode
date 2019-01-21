package com.alan.leetcode.recursiondivideconquer;

import com.alan.leetcode.util.TreeNode;

import java.util.List;

/**
 * 104. Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Note: A leaf is a node with no children.
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 * @author stone
 * @date 2019/1/15/015 15:14
 **/
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return java.lang.Math.max(left_height, right_height) + 1;
        }
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
        MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
        int maxDepth = obj.maxDepth(node1);
        System.out.println(maxDepth);
    }

}
