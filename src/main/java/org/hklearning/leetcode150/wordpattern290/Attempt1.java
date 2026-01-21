package org.hklearning.leetcode150.wordpattern290;

import java.util.HashMap;
import java.util.Map;

public class Attempt1 {
    public boolean wordPattern(String pattern, String s) {
        int pl = pattern.length();
        String[] words = s.split(" ");
        int sl = words.length;
        if(pl!=sl)
            return false;
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> mapper = new HashMap<>();
        for(int i=0;i<pl;i++){
            char index = pattern.charAt(i);
            String tempWord = words[i];
            if(map.containsKey(index) && !map.get(index).equals(tempWord) || mapper.containsKey(tempWord) && !mapper.get(tempWord).equals(index))
                return false;
            else{
                map.put(index, tempWord);
                mapper.put(tempWord, index);
            }
        }

        return true;
    }
}
