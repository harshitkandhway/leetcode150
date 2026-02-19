package org.hklearning.leetcode150.partitionlist86;

import org.hklearning.ListNode;

public class Attempt1 {
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode();
        ListNode bigger = new ListNode();
        ListNode hbig=bigger,hsmall=smaller;
        while(head!=null){
            if(head.val>=x){
                bigger.next = head;
                bigger = bigger.next;
            } else{
                smaller.next = head;
                smaller = smaller.next;
            }
            head = head.next;
        }
        bigger.next = null;
        smaller.next = hbig.next;
        return hsmall.next;
    }
}
