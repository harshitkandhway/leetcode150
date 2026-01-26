package org.hklearning.leetcode150.addtwonumbers2;

import java.util.Objects;

public class Attempt1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2;
        ListNode res = null,temp=null,head=null;
        int carry=0;
        while(temp1!=null && temp2!=null){

            int val = temp1.val+temp2.val + carry;
            if(val>=10){
                temp = new ListNode(val%10,null);
                carry = 1;
            } else{
                temp = new ListNode(val,null);
                carry = 0;
            }
            if(Objects.isNull(res)){
                res = temp;
                head = temp;
            } else{
                res.next = temp;
                res = res.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(Objects.isNull(temp1) && temp2!=null){
                while(temp2!=null){
                    val = temp2.val + carry;
                    if(val>=10){
                        temp = new ListNode(val%10,null);
                        carry = 1;
                    } else{
                        temp = new ListNode(val,null);
                        carry = 0;
                    }
                    res.next = temp;
                    res = res.next;
                    temp2 = temp2.next;
                }
            }
            if(Objects.isNull(temp2) && temp1!=null){
                while(temp1!=null){
                    val = temp1.val + carry;
                    if(val>=10){
                        temp = new ListNode(val%10,null);
                        carry = 1;
                    } else{
                        temp = new ListNode(val,null);
                        carry = 0;
                    }
                    res.next = temp;
                    res = res.next;
                    temp1 = temp1.next;
                }
            }
        }
        if(carry==1){
            temp = new ListNode(1,null);
            res.next = temp;
        }

        return head;
    }
}
