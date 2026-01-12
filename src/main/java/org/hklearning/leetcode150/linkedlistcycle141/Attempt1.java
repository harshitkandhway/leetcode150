package org.hklearning.leetcode150.linkedlistcycle141;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Boolean> visited = new HashMap();
        ListNode temp = head;
        if(temp==null)
            return false;
        while(temp.next!=null){
            if(visited.containsKey(temp))
                return true;
            else{
                visited.put(temp, true);
                temp = temp.next;
            }
        }
        return false;
    }
}
