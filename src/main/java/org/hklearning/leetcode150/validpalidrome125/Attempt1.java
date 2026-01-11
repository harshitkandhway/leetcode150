package org.hklearning.leetcode150.validpalidrome125;

public class Attempt1 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0,n=s.length()-1;
        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            } else{
                i++;
                n--;
            }
        }
        return true;
    }
}
