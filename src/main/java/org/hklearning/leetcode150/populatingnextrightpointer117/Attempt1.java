package org.hklearning.leetcode150.populatingnextrightpointer117;

public class Attempt1 {
    public Node connect(Node root) {
        if (root == null) return null;
        Node currentLevelHead = root;
        while (currentLevelHead != null) {
            Node dummy = new Node(0);
            Node temp = dummy;
            Node curr = currentLevelHead;
            while (curr != null) {
                if (curr.left != null) {
                    temp.next = curr.left;
                    temp = temp.next;
                }
                if (curr.right != null) {
                    temp.next = curr.right;
                    temp = temp.next;
                }
                curr = curr.next;
            }
            currentLevelHead = dummy.next;
        }

        return root;
    }
}
