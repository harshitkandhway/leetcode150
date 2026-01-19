package org.hklearning.leetcode150.rotatearray189;

public class Attempt1 {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int t = k%size;
        rotateA(nums, 0, size-t-1);
        rotateA(nums, size-t, size-1);
        rotateA(nums, 0, size-1);
    }
    public void rotateA(int[] nums, int i, int j){
        int temp=0;
        while(i<j){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }
}
