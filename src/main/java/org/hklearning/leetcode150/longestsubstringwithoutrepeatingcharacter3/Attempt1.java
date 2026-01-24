package org.hklearning.leetcode150.longestsubstringwithoutrepeatingcharacter3;

public class Attempt1 {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        boolean[] arr = new boolean[128];
        while(j<s.length()){
            char c = s.charAt(j);
            if(!arr[c]){
                arr[c]=true;
            } else{
                max = Math.max(max, j-i);
                if(c!=s.charAt(i)){
                    while(s.charAt(i)!=c){
                        arr[s.charAt(i)]=false;
                        i++;
                    }
                    arr[c] = true;
                }
                i++;
            }
            j++;
        }
        return Math.max(max, j-i);
    }
}
