package org.hklearning.leetcode150.math;

public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {
        int count=0;
        int i=1,val=-1;
        while(val!=0){
            val = (int)(n/Math.pow(5,i));
            count += val;
            i++;
        }
        return count;
    }
}
