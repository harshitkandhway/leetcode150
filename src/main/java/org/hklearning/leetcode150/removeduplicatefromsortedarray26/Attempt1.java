package org.hklearning.leetcode150.removeduplicatefromsortedarray26;

public class Attempt1 {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1;
        int val = nums[0];
        while(j<nums.length){
            if(nums[j]!=val){
                val=nums[j];
                nums[i++]=val;
            }else{
                j++;
            }
        }
        return i;
    }
}
