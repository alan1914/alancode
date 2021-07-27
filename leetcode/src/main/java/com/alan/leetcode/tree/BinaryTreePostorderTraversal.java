package com.alan.leetcode.tree;

import alan.leetcode.util.TreeNode;

import java.util.ArrayList;

/**
 * @author stone
 * @des 二叉树的后续遍历
 * @date 2019/1/8/008 15:49
 **/
public class BinaryTreePostorderTraversal {

    public static ArrayList<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        run(root, list);
        return list;
    }

    public static void run(TreeNode node, ArrayList<Integer> list) {
        if (node.left != null) {
            run(node.left, list);
        }
        if (node.right != null) {
            run(node.right, list);
        }
        list.add(node.val);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node2.right = node3;
        node1.right = node2;

        ArrayList<Integer> list = postorderTraversal(node1);
        System.out.println(list);


    }


//    public ArrayList<Integer> postorderTraversal(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        if(root == null){
//            return list;
//        }
//        test(root,list);
//        return list;
//    }
//
//    public void test(TreeNode node,ArrayList<Integer> list){
//        if(node.left != null){
//            test(node.left,list);
//        }
//        if(node.right != null){
//            test(node.right,list);
//        }
//        list.add(node.val);
//    }


}
