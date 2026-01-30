package org.hklearning.leetcode150.copylistwithrandompointers138;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public Node copyRandomList(Node head) {
        Node temp, head1=head,head2=head;
        Map<Node, Node> mapper = new HashMap();
        while(head!=null){
            temp = new Node(head.val);
            mapper.put(head,temp);
            head = head.next;
        }
        while(head1!=null){
            Node newNode = mapper.get(head1);
            newNode.next = head1.next==null?null:mapper.get(head1.next);
            newNode.random = head1.random==null?null:mapper.get(head1.random);
            head1 = head1.next;
        }
        return mapper.get(head2);

    }
}
