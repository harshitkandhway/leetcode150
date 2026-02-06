package org.hklearning.practice;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        Set<Integer> val = new HashSet<Integer>();
        for(int num : nums){
            if(val.contains(num))
                val.remove(num);
            else
                val.add(num);
        }
        return val.iterator().next();
    }

    public int singleNumber2(int[] nums) {
        int result=0;
        for(int num : nums){
            result ^= num;//optimized code which uses XOR to identify the non-duplicate number.
        }
        return result;
    }
}
