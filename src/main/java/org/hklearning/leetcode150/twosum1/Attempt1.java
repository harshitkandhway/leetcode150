package org.hklearning.leetcode150.twosum1;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> mapper = new HashMap();
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp = target-nums[i];
            if(mapper.containsKey(nums[i])){
                res[0]=mapper.get(nums[i]);
                res[1]=i;
                return res;
            }
            mapper.put(temp,i);
        }
        return null;
    }
}
