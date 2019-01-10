package com.alan.leetcode.tree;

/**
 * @author stone
 * @des 二叉树的最小深度
 * @date 2018/12/29/029 14:52
 **/
public class MinimumDepthOfBinaryTree {

    /**
     * Definition for binary tree
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 获取最小深度
     *
     * @param root
     * @return
     */
    public int run(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if (root.right == null) {
            return run(root.left) + 1;
        }
        if (root.left == null) {
            return run(root.right) + 1;
        }
        return Math.min(run(root.left), run(root.right)) + 1;
    }


}
