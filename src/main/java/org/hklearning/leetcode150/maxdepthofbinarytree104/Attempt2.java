package org.hklearning.leetcode150.maxdepthofbinarytree104;

import org.hklearning.TreeNode;

public class Attempt2 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
