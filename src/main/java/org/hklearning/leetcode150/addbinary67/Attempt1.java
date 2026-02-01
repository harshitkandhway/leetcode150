package org.hklearning.leetcode150.addbinary67;

public class Attempt1 {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}
