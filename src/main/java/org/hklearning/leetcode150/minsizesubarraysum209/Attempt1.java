package org.hklearning.leetcode150.minsizesubarraysum209;

public class Attempt1 {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length){
            sum += nums[j];
            if(sum>=target){
                while(sum>=target){
                    min = Math.min(min, j-i+1);
                    sum -= nums[i];
                    i++;
                }
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
