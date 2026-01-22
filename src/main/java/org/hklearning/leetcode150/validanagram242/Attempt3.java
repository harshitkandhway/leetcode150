package org.hklearning.leetcode150.validanagram242;

public class Attempt3 {
    public boolean isAnagram(String s, String t) {
        int[] mapper = new int[26];
        if(s.length()!=t.length())
            return false;
        for(char cs : s.toCharArray())
            mapper[cs-'a']++;
        for(char ct : t.toCharArray()){
            if(mapper[ct-'a']==0)
                return false;
            mapper[ct-'a']--;
        }
        for(int j=0;j<26;j++){
            if(mapper[j]!=0)
                return false;
        }
        return true;
    }
}
