package org.hklearning.leetcode150.isomorphicstring205;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            char s1,t1;
            if(s.length()!=t.length())
                return false;
            Map<Character, Character> mapper1 = new HashMap();
            Map<Character, Character> mapper2 = new HashMap();
            for(int i=0;i<s.length();i++){
                s1 = s.charAt(i);
                t1 = t.charAt(i);
                if(mapper1.containsKey(s1)){
                    if(mapper1.get(s1)!=t1)
                        return false;
                }
                mapper1.put(s1,t1);
                if(mapper2.containsKey(t1)){
                    if(mapper2.get(t1)!=s1)
                        return false;
                }
                mapper2.put(t1,s1);
            }
            return true;
        }
    }
}
