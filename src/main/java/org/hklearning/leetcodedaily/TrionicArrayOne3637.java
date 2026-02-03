package org.hklearning.leetcodedaily;

public class TrionicArrayOne3637 {
    //Attempt1
    public boolean isTrionic(int[] nums) {
        int countChange=0;
        boolean lastIncreasingState=false,currentIncreasingState=false;
        if(nums[1]<=nums[0])
            return false;
        else
            lastIncreasingState = true;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return false;
            } else{
                if(nums[i-1]<nums[i]){
                    currentIncreasingState = true;
                } else{
                    currentIncreasingState = false;
                }
                if(lastIncreasingState && !currentIncreasingState || !lastIncreasingState && currentIncreasingState){
                    countChange++;
                    lastIncreasingState = currentIncreasingState;
                }
            }
        }
        return countChange==2;
    }

    public boolean isTrionicOptimized(int[] nums) {
        int count=0;
        boolean lastInc=true,currentInc;
        if(nums[1]<=nums[0])
            return false;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]==nums[i]) return false;
            currentInc = nums[i - 1] < nums[i];
            if(lastInc != currentInc){
                count++;
                lastInc = currentInc;
            }
            if(count>2) return false;
        }
        return count==2;
    }
}
