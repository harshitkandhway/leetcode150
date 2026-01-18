package org.hklearning.leetcode150.ransomnote343;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapper = new HashMap();
        for(int i=0;i<magazine.length();i++){
            char temp = magazine.charAt(i);
            if(mapper.containsKey(temp)){
                mapper.put(temp,mapper.get(temp)+1);
            } else{
                mapper.put(temp,1);
            }
        }
        for(int j=0;j<ransomNote.length();j++){
            char temp = ransomNote.charAt(j);
            if(mapper.containsKey(temp)){
                if(mapper.get(temp)==0)
                    return false;
                else
                    mapper.put(temp,mapper.get(temp)-1);
            } else
                return false;
        }
        return true;
    }
}
