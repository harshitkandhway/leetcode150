package org.hklearning.leetcode150.productOfArrayWithoutSelf238;

public class Attempt1 {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int zeroIndex = -1;
        int product=1;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                zeroIndex = i;
            } else{
                product *= nums[i];
            }
        }
        if(zeroCount>= 2)
            return result;
        else if(zeroCount==1){
            result[zeroIndex] = product;
            return result;
        }
        int i=0;
        for(int num : nums){
            result[i] = product/num;
            i++;
        }
        return result;

    }
}
