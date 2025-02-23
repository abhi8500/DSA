package org.DSA.Tree;


/// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return val + " -> (" +
                "L:" + (left != null ? left.toString() : "null") + ", " +
                "R:" + (right != null ? right.toString() : "null") + ")";
    }
}
