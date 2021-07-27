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
 * @date 2019/1/14/014 15:08
 **/
public class ValidBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void inorder(TreeNode node, ArrayList<Integer> list) {
        if (node.left != null) {
            inorder(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            inorder(node.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = null;
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//
//        node2.right = node3;
//        node1.right = node2;

        ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
        boolean bool = validBinarySearchTree.isValidBST(node1);
        System.out.println(bool);

    }

}
