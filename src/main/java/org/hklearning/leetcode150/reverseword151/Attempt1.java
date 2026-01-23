package org.hklearning.leetcode150.reverseword151;

import java.util.StringTokenizer;

public class Attempt1 {
    public String reverseWords(String s) {
        String t = s.trim().replaceAll("  "," ");
        int i=0, j=s.length()-1;
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st = new StringTokenizer(t," ");
        while(st.hasMoreTokens()){
            sb.insert(0,st.nextToken()+" ");
        }
        return sb.toString().trim();
    }
}
