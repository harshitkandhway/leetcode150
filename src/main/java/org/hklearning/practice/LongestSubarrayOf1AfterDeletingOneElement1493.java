package org.hklearning.practice;

public class LongestSubarrayOf1AfterDeletingOneElement1493 {
    class Solution {
        public int longestSubarray(int[] nums) {
            int count=0,j=0;
            int maxCount=0;
            int k = nums.length;
            int leftSum=0;
            boolean isRight=false;
            while(j<k){
                if(nums[j]==1)
                    count++;
                else{
                    if(isRight)
                        maxCount = Math.max(leftSum+count,maxCount);
                    leftSum = count;
                    count=0;
                    isRight=true;
                }
                j++;
            }
            if(count==k)
                return count-1;
            return Math.max(leftSum+count,maxCount);
        }
    }
}
