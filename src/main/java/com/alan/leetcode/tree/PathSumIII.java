package com.alan.leetcode.tree;

import com.alan.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 437. Path Sum III
 * You are given a binary tree in which each node contains an integer value.
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 *
 * @author stone
 * @date 2019/1/21/021 17:08
 **/
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<Integer>();

        int tempValue = 0;
        if(tempValue == sum){
            System.out.println(list);
        }
        if (root.left != null) {
            root = root.left;
            pathSum(root, tempValue + root.val);
            list.add(root.val);
        }
        if (root.right != null) {
            root = root.right;
            pathSum(root, tempValue + root.val);
            list.add(root.val);
        }
        return tempValue;
    }
}
