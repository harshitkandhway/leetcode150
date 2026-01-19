package org.hklearning.leetcode150.lengthoflastword58;

public class Attempt1 {
    public int lengthOfLastWord(String s) {
        String t = s.trim();
        int j = t.length()-1;
        int lengths = 0;
        while(j>=0 && t.charAt(j)!=' '){
            lengths++;
            j--;
        }
        return lengths;
    }
}
