package org.hklearning.leetcode150.maxsumcircularsubarray918;

public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxCur = 0, maxRes = nums[0];
        int minCur = 0, minRes = nums[0];
        for (int x : nums) {
            maxCur = Math.max(x, maxCur + x);
            maxRes = Math.max(maxRes, maxCur);
            minCur = Math.min(x, minCur + x);
            minRes = Math.min(minRes, minCur);
            totalSum += x;
        }
        if (maxRes < 0) {
            return maxRes;
        }
        return Math.max(maxRes, totalSum - minRes);
    }
}
