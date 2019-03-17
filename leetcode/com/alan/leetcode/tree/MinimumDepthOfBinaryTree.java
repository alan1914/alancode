package com.alan.leetcode.tree;

import com.alan.leetcode.util.TreeNode;

/**
 * @author stone
 * @des 二叉树的最小深度
 * @date 2018/12/29/029 14:52
 **/
public class MinimumDepthOfBinaryTree {

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
