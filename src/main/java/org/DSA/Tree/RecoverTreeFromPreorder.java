package org.DSA.Tree;


public class RecoverTreeFromPreorder {

    static int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        index = 0;
        return recoverHelper(traversal, 0);

    }

    private TreeNode recoverHelper(String traversal, int depth) {

        // Base case
        if (index >= traversal.length())
            return null;

        // Count no of dashes
        int dashCount = 0;
        while ((index + dashCount) < traversal.length()
                && traversal.charAt(index + dashCount) == '-') {
            dashCount++;
        }

        if (dashCount != depth)
            return null;
        // Move index past the dashes
        index += dashCount;
        // Extract the node value
        int value = 0;
        while (index < traversal.length() &&
                Character.isDigit(traversal.charAt(index))) {
            value = value * 10 + (traversal.charAt(index++) - '0');
        }
        // Create the current node
        TreeNode node = new TreeNode(value);

        // Recursively build the left and right subtrees
        node.left = recoverHelper(traversal, depth + 1);
        node.right = recoverHelper(traversal, depth + 1);

        return node;

    }
}
