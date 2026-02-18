package org.hklearning.leetcode150.bitmanipulation;

public class NumberOf1Bits191 {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }
    public int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // This clears the least significant set bit
            count++;
        }
        return count;
    }
    public int hammingWeight3(int n) {
        return Integer.bitCount(n);
    }
}
