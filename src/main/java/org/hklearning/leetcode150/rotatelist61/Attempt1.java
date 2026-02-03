package org.hklearning.leetcode150.rotatelist61;

public class Attempt1 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head,newHead,second=head;
        int count =0;
        if(k==0||head==null||head.next==null)
            return head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }

        int rotation = k%(count+1);
        if(rotation==0)
            return head;
        count = count-rotation;
        int t=0;
        while(t<count){
            second = second.next;
            t++;
        }
        newHead = second.next;
        second.next=null;
        temp.next= head;
        return newHead;
    }
}
