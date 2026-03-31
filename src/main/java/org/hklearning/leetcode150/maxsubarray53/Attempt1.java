package org.hklearning.leetcode150.maxsubarray53;
public class Attempt1 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if (currentSum > maxGlobal) {
                maxGlobal = currentSum;
            }
        }
        return maxGlobal;
    }
}
