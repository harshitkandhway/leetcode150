package org.hklearning.leetcode150.findminimuminrotatedsortedarray153;

public class Attempt1 {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min)
                return nums[i];
        }
        return min;
    }
}
