package org.hklearning.leetcode150.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        view(root, result, 0);
        return result;
    }
    private void view(TreeNode curr, List<Integer> result, int depth) {
        if (curr == null) {
            return;
        }
        if (depth == result.size()) {
            result.add(curr.val);
        }
        view(curr.right, result, depth + 1);
        view(curr.left, result, depth + 1);
    }
}
