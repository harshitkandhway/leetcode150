package org.hklearning.practice;

import org.hklearning.ListNode;

public class DeleteDuplicatesINLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head,t=head;
        if(head==null || head.next==null)
            return head;
        while(t.next!=null){
            int value = t.val;
            while(temp.next.val==value){
                temp = temp.next;
            }
            if(temp!=t){
                t.next=temp.next;
                t = temp;
            }
            t = t.next;
            temp = t;

        }
        return head;
    }
}
