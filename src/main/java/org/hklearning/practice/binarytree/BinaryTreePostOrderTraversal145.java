package org.hklearning.practice.binarytree;

import org.hklearning.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(TreeNode root, List<Integer> list){
        if(root!=null){
            postOrder(root.left, list);
            postOrder(root.right, list);
            list.add(root.val);
        }
    }
}
