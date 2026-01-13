package org.hklearning.leetcode150.validparenthesis20;

import java.util.Stack;

public class Attempt1 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack();
            int i=0;
            char temp;
            while(i<s.length()){
                char t = s.charAt(i);
                if(t=='('||t=='['||t=='{')
                    stack.push(t);
                else if(stack.isEmpty())
                    return false;
                else if(t==')' && stack.pop()!='(')
                    return false;
                else if(t==']' && stack.pop()!='[')
                    return false;
                else if(t=='}' && stack.pop()!='{')
                    return false;
                i++;
            }
            return stack.isEmpty();
        }
    }
}
