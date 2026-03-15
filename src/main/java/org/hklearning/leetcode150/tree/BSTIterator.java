package org.hklearning.leetcode150.tree;

import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        this.stack = new Stack<>();
        pushLeftChildren(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        if (node.right != null) {
            pushLeftChildren(node.right);
        }
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeftChildren(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
