package org.hklearning.leetcodedaily;

public class TransformedArray3379 {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int temp;
        int[] res = new int[len];
        for(int i=0;i<nums.length;i++){
            temp = (i+(nums[i]%len));
            if(temp>=len)
                temp=temp-len;
            if(temp<0)
                temp = len+temp;
            res[i] = nums[temp];
        }
        return res;
    }
}
