package org.hklearning.practice.linkedlist;

import org.hklearning.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(set.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;
    }
}
