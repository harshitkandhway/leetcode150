package org.hklearning.leetcode150.removeduplicatefromsortedarrayII80;

public class Attempt1 {
    public int removeDuplicates(int[] nums) {
        int i=1, n=nums.length, j=1,counter=1;
        int val = nums[0];
        while(i<n){
            while(i<n && nums[i]==val){
                if(counter++<2){
                    nums[j++]=nums[i++];
                } else{
                    i++;
                }
            }
            if(i<n){
                val = nums[i];
                nums[j++]=nums[i++];
                counter=1;
            }
        }
        return j;
    }
}
