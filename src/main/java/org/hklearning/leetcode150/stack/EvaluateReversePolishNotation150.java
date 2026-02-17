package org.hklearning.leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String token : tokens){
            if(Arrays.asList("+","-","*","/").contains(token)){
                int op2 = stack.pop();
                int op1 = stack.pop();
                switch(token){
                    case "+" : stack.add(op1+op2); break;
                    case "-" : stack.add(op1-op2); break;
                    case "*" : stack.add(op1*op2); break;
                    case "/" : stack.add(op1/op2); break;
                }
            } else{
                stack.add(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    public int evalRPN2(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.add(op1+op2);
            } else if (token.equals("-")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.add(op1-op2);
            } else if (token.equals("/")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.add(op1/op2);
            } else if (token.equals("*")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.add(op1*op2);
            } else{
                stack.add(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    public int evalRPN3(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            switch(token){
                case "+" : stack.push(stack.pop()+stack.pop()); break;
                case "-" : int op1 = stack.pop();stack.push(stack.pop()-op1); break;
                case "/" : int op2 = stack.pop();stack.push(stack.pop()/op2); break;
                case "*" : stack.push(stack.pop()*stack.pop()); break;
                default : stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public int evalRPN4(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = 0;
        for (String s : tokens) {
            if (s.length() == 1 && "+-*/".contains(s)) {
                int op2 = stack[--top];
                int op1 = stack[--top];
                switch (s.charAt(0)) {
                    case '+': stack[top++] = op1 + op2; break;
                    case '-': stack[top++] = op1 - op2; break;
                    case '*': stack[top++] = op1 * op2; break;
                    case '/': stack[top++] = op1 / op2; break;
                }
            } else {
                stack[top++] = Integer.parseInt(s);
            }
        }
        return stack[0];
    }
}
