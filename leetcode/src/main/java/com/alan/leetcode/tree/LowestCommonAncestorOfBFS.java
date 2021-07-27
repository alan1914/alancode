package com.alan.leetcode.tree;

import alan.leetcode.util.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T
 * that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
 * <p>
 * 解法一：
 * Path(parent)
 * path1 -> LCA
 * path2
 * <p>
 * 解法二：
 * recursion
 *
 * @author stone
 * @date 2019/1/14/014 15:59
 **/
public class LowestCommonAncestorOfBFS {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null){
            if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else if(root.val < p.val && root.val < q.val){
                root = root.right;
            }else{
                return root;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfBFS obj = new LowestCommonAncestorOfBFS();
    }
}
