package org.hklearning.practice.addtwonumbers02;

import java.math.BigInteger;
import java.util.Objects;

public class AddTwoNums2 {

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        long count=0,value=0,value2=0;
        while(head1 != null){
            value += head1.val*(long)Math.pow(10,count);
            head1 = head1.next;
            count++;
        }
        count=0;
        while(head2 != null){
            value2 += head2.val*(long)Math.pow(10,count);
            head2 = head2.next;
            count++;
        }
        long total = value + value2;
        System.out.println(value+" --- "+value2);
        if(total==0)
            return new ListNode(0,null);
        ListNode curr = null,temp=null,head=null;
        while(total>0){
            int t = (int)(total%10);
            temp = new ListNode(t,null);
            if(Objects.nonNull(curr))
                curr.next = temp;
            else
                head = temp;
            curr = temp;
            total /= 10;
        }
        return head;
    }

    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        BigInteger value1 = BigInteger.ZERO;
        BigInteger multiplier = BigInteger.ONE;
        while (l1 != null) {
            value1 = value1.add(BigInteger.valueOf(l1.val).multiply(multiplier));
            multiplier = multiplier.multiply(BigInteger.TEN);
            l1 = l1.next;
        }
        BigInteger value2 = BigInteger.ZERO;
        multiplier = BigInteger.ONE;
        while (l2 != null) {
            value2 = value2.add(BigInteger.valueOf(l2.val).multiply(multiplier));
            multiplier = multiplier.multiply(BigInteger.TEN);
            l2 = l2.next;
        }
        BigInteger total = value1.add(value2);
        if (total.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }
        ListNode head = null;
        ListNode curr = null;

        while (total.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] dr = total.divideAndRemainder(BigInteger.TEN);
            int digit = dr[1].intValue();
            total = dr[0];
            ListNode temp = new ListNode(digit);
            if (head == null) {
                head = temp;
            } else {
                curr.next = temp;
            }
            curr = temp;
        }
        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,null);
        //[1,9,9,9,9,9,9,9,9,9]
        ListNode l2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
    }
}
