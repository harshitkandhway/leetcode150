package org.hklearning.leetcode150.maxdepthofbinarytree104;

import org.hklearning.TreeNode;

public class Attempt1 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int leftLen = maxDepth(root.left);
            int rightLen = maxDepth(root.right);
            return 1 + Math.max(leftLen, rightLen);
        }
    }
}
