package org.hklearning.leetcode150.validanagram242;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public boolean isAnagram(String s, String t) {
        int count=0;
        Map<Character, Integer> mapper = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char temp = s.charAt(i);
            if(mapper.containsKey(temp)){
                mapper.put(temp, mapper.get(temp)+1);
            } else {
                mapper.put(temp,1);
            }
        }
        count = mapper.keySet().size();
        for(int j=0;j<t.length();j++){
            char temp = t.charAt(j);
            if(mapper.containsKey(temp) && mapper.get(temp)>0){
                mapper.put(temp, mapper.get(temp)-1);
                if(mapper.get(temp)==0)
                    count--;
            } else{
                return false;
            }
        }
        return count==0;
    }
}
