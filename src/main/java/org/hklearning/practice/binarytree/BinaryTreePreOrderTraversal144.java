package org.hklearning.practice.binarytree;

import org.hklearning.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList();
        preOrder(root,list);
        return list;

    }
    public void preOrder(TreeNode root, List<Integer> list){
        if(root!=null){
            list.add(root.val);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }
}
