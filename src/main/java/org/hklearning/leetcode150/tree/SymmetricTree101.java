package org.hklearning.leetcode150.tree;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if(root!=null){
            return mirror(root.left,root.right);
        }
        return false;
    }

    public boolean mirror(TreeNode lNode,TreeNode rNode){
        if(lNode==null && rNode==null)
            return true;
        if(lNode==null || rNode==null)
            return false;
        else
            return (lNode.val == rNode.val)
                    && mirror(lNode.left, rNode.right)
                    && mirror(lNode.right, rNode.left);
    }
}
