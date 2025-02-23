package org.DSA.Tree;

public class RecoverFromPreAndPostOrder {


    public static void main(String[] args) {
        int[] preorder = new int[]{1, 2, 4, 5, 3, 6, 7};
        int[] postorder = new int[]{4, 5, 2, 6, 7, 3, 1};

        preIndex = 0;
        postIndex = 0;

        System.out.println(constructFromPrePost(preorder, postorder));
        System.out.println("------Optimized recursion approach------");
        System.out.println(constructTree(preorder, postorder));
    }


    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return constructTree(0, n - 1, 0, preorder, postorder);
    }

    /**
     * <b>Divide And Conquer Approach</b>
     * <p>
     * We know the first node of preorder traversal is root of the tree and second node is root of left subtree.
     * Using above pattern we can form the root and left subtree root .
     * Our task is to determine which parts of the preorder in the left subtree. To know that we will use postorder by finding the index where
     * left subtree root is pointed. So the elements which are between root and root plus no of elements in left we will form left subtree .
     * To form right subtree we will use index starts from root index plus no of elements in the left subtree and last index as end index as end.
     * We will recursively call above process until we reach the base cases.
     * <br>
     * <b><font color="blue">Base case - 1 :</font> </b>
     * If the preStart index is greater than preEnd then there are no nodes to process, return null
     * <br>
     * <b><font color="blue">Base case - 2 :</font></b>
     * If the preStart index is equal to preEnd then only one node is left, return that node
     * <br>
     * <b><font color="red">Time Complexity :</font> </b> O(n2)
     * <br>
     * We call the constructTree function n times, once for each element in the preorder array. In each call,
     * the function makes a linear pass over the postorder array to find the position of the element that matches
     * the root of the left subtree. This means each call to constructTree takes O(n)time, and with n calls in total, the overall time complexity isO(n2).
     * <br>
     * <b><font color="red">Space Complexity :</font> </b> O(n)
     * <br>
     * Since we are not using any additional data structures other than the input arrays and the result tree,
     * the space complexity is determined by the depth of the recursion.
     * In the worst case, where the tree is a list of nodes with only left children,
     * the recursion will goO(n)levels deep, one for each node. Therefore, the algorithm requiresO(n)extra space.
     * <br>
     * </p>
     *
     * @param preStart  start index in preorder
     * @param preEnd    last index in preorder
     * @param postStart pointer in postorder
     * @param preorder  The preorder array
     * @param postorder The postorder array
     * @return the root of the tree.
     **/
    private static TreeNode constructTree(int preStart, int preEnd, int postStart, int[] preorder, int[] postorder) {

        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }

        int leftRootNode = preorder[preStart + 1];
        int numOfNodesInLeft = 1;
        while (postorder[postStart + numOfNodesInLeft - 1] != leftRootNode) {
            numOfNodesInLeft++;
        }

        TreeNode rootNode = new TreeNode(preorder[preStart]);

        rootNode.left = constructTree(preStart + 1, preStart + numOfNodesInLeft, postStart, preorder, postorder);
        rootNode.right = constructTree(preStart + numOfNodesInLeft + 1, preEnd, postStart + numOfNodesInLeft, preorder, postorder);

        return rootNode;
    }


    /**
     * <b>Optimized Recursion Approach</b>
     * <p>
     * <br>
     * <b><font color="red">Time Complexity :</font> </b> O(n)
     * <br>
     * We are making n recursive calls, one for each node in the tree. Each call of the construct Tree function
     * involves only constant-time operations, like comparing values and incrementing pointers, and therefore the overall time complexity isO(n).
     * <br>
     * <b><font color="red">Space Complexity :</font> </b> O(n)
     * <br>
     * Since we are not using any additional data structures,
     * the auxiliary space complexity is determined by the recursion depth.
     * In the worst case (when the postorder array contains the nodes in reverse order from the preorder array),
     * we make n recursive calls to create all the nodes before starting to backtrack.
     * Therefore, the recursion depth can reachO(n), which also corresponds to the space complexity of the algorithm.
     * <br>
     * @param preorder  The preorder array
     * @param postorder The postorder array
     * @return the root of the tree.
     **/
    static int preIndex;
    static int postIndex;

    private static TreeNode constructTree(int[] preorder, int[] postorder) {
        TreeNode rootNode = new TreeNode(preorder[preIndex++]);

        if (rootNode.val != postorder[postIndex]) {
            rootNode.left = constructTree(preorder, postorder);
        }

        if (rootNode.val != postorder[postIndex]) {
            rootNode.right = constructTree(preorder, postorder);
        }

        postIndex++;

        return rootNode;
    }
}
