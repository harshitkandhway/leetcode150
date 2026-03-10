package org.hklearning.practice.linkedlist;

import org.hklearning.ListNode;

public class DeleteDuplicatesInLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode dup = null;
        while(temp!=null){
            dup = temp;
            while(dup.next!=null && dup.next.val==temp.val){
                dup = dup.next;
            }
            temp.next = dup.next;
            temp = temp.next;
        }
        return head;
    }
}
