package org.DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {

        int deepLeavesSum = 0;

        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);

        while(!qu.isEmpty()){
            int quSize = qu.size();
            deepLeavesSum = 0;
            for(int i=0;i<quSize;i++){
                TreeNode removedNode = qu.remove();
                if(removedNode.left != null){
                    qu.add(removedNode.left);
                }
                if(removedNode.right != null){
                    qu.add(removedNode.right);
                }
                deepLeavesSum += removedNode.val;
            }
        }

        return deepLeavesSum;

    }
}
