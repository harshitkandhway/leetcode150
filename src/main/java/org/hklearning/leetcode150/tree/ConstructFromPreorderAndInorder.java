package org.hklearning.leetcode150.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructFromPreorderAndInorder {
    private Map<Integer, Integer> inorderMap;
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return construct(preorder, 0, inorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = inorderMap.get(rootVal);
        root.left = construct(preorder, inStart, rootIndex - 1);
        root.right = construct(preorder, rootIndex + 1, inEnd);
        return root;
    }
}
