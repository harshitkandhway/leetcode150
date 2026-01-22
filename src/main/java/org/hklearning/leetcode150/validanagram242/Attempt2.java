package org.hklearning.leetcode150.validanagram242;

public class Attempt2 {
    public boolean isAnagram(String s, String t) {
        int[] mapper = new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0; i<s.length();i++){
            mapper[s.charAt(i)-'a']++;
            mapper[t.charAt(i)-'a']--;
        }
        for(int j=0;j<26;j++){
            if(mapper[j]!=0)
                return false;
        }
        return true;
    }
}
