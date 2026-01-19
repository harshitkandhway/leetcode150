package org.hklearning.leetcode150.majorityelement169;

public class Attempt2 {
    /*
    The Best Optimization: Boyer-Moore Voting Algorithm
    Since the majority element is guaranteed to appear more than n/2 times,
    it will always "outlast" all other elements if we pair them off and cancel them out.
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            // If the current number is the same as our candidate, increment.
            // Otherwise, decrement the count (pairing them off).
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
