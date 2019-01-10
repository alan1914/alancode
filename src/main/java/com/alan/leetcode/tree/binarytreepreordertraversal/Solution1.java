package com.alan.leetcode.tree.binarytreepreordertraversal;

import java.util.ArrayList;

/**
 * @author stone
 * @des 先序遍历 测试用例{1,#,2,3}
 * @date 2019/1/9/009 9:37
 **/
public class Solution1 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        run(root, list);
        return list;
    }

    public static void run(TreeNode node, ArrayList<Integer> list) {
        list.add(node.val);
        if (node.left != null) {
            run(node.left, list);
        }
        if (node.right != null) {
            run(node.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node2.right = node3;
        node1.right = node2;

        ArrayList<Integer> list = preorderTraversal(node1);
        System.out.println(list);


    }



}
