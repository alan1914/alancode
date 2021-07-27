package com.alan.leetcode.tree;

import alan.leetcode.util.TreeNode;

import java.util.ArrayList;

/**
 * 98. Validate Binary Search Tree
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * <p>
 * 解法一：
 * In-order 中序遍历 -> array 升序
 * time O(n)
 * <p>
 * 解法二：
 * Recursion 递归:validate(...,min,max)
 * max<-validate(node.left)
 * min<-validate(node.right)
 * max < root ; min > root
 * 同理！
 * time O(n)
 *
 * @author stone
 * @date 2019-04-14
 **/
public class ValidBinarySearchTree3 {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValid(root.left, min, root.val) &&
                isValid(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node2.right = node3;
        node1.right = node2;

        ValidBinarySearchTree3 validBinarySearchTree = new ValidBinarySearchTree3();
        boolean bool = validBinarySearchTree.isValidBST(node1);
        System.out.println(bool);

    }

}
