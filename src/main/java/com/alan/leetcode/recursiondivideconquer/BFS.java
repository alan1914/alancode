//package com.alan.leetcode.recursiondivideconquer;
//
//import com.alan.leetcode.util.TreeNode;
//
//import java.util.*;
//
///**
// * @author stone
// * @des TODO
// * @date 2019/1/15/015 14:50
// **/
//public class BFS {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> resultList = new ArrayList<List<Integer>>(16);
//        if (root == null) {
//            return resultList;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        Set<TreeNode> visitedSet = new HashSet<TreeNode>(16);
//        visitedSet.add(root);
//
//        while (queue != null) {
//            TreeNode node = queue.poll();
//            visitedSet.add(node);
//            if (node.left != null && !visitedSet.contains(node)) {
//                queue.add(node.left);
//            }
//            if (node.right != null && !visitedSet.contains(node)) {
//                queue.add(node.right);
//            }
//        }
//        for(TreeNode item : visitedSet){
//            resultList.
//        }
//
//        return visitedSet;
//    }
//
//    public Queue<TreeNode> generateRelatedNodes(TreeNode node, Queue<TreeNode> queue, Set<TreeNode> visitedSet) {
//
//    }
//
//    public static void main(String[] args) {
//        //  [3,9,20,null,null,15,7]
//        TreeNode node1 = new TreeNode(3);
//        TreeNode node2 = new TreeNode(9);
//        TreeNode node3 = new TreeNode(20);
//        TreeNode node4 = new TreeNode(15);
//        TreeNode node5 = new TreeNode(7);
//        node1.left = node2;
//        node1.right = node3;
//        node3.right = node4;
//        node3.left = node5;
//    }
//}
