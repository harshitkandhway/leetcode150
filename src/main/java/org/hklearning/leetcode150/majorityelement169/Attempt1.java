package org.hklearning.leetcode150.majorityelement169;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int n : nums){
            if(map.containsKey(n)){
                int value = map.get(n)+1;
                if(value > nums.length/2)
                    return n;
                map.put(n,value);
            } else
                map.put(n,1);
        }
        return nums[0];
    }
}
