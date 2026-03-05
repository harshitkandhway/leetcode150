package org.hklearning.leetcode150.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructThroughInorderAndPostOrder106 {
    private int postIndex;
    private Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        int index = inorderMap.get(rootVal);
        root.right = build(postorder, index + 1, inEnd);
        root.left = build(postorder, inStart, index - 1);
        return root;
    }
}
