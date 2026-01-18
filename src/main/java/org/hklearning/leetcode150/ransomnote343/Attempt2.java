package org.hklearning.leetcode150.ransomnote343;

public class Attempt2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] result = new int[26];
        int master = magazine.length();
        int search = ransomNote.length();
        if(search>master)
            return false;
        for(int i=0;i<master;i++){
            result[magazine.charAt(i)-'a']++;
        }
        for(int j=0;j<search;j++){
            int index = ransomNote.charAt(j)-'a';
            if(result[index]<=0)
                return false;
            result[index]--;
        }
        return true;
    }
}
