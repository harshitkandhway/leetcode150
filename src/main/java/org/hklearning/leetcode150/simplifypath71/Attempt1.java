package org.hklearning.leetcode150.simplifypath71;

import java.util.ArrayDeque;
import java.util.Deque;

public class Attempt1 {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] components = path.split("/");
        for (String directory : components) {
            if (directory.equals(".") || directory.isEmpty()) {
                continue;
            }
            if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            }
            else {
                stack.addLast(directory);
            }
        }
        StringBuilder result = new StringBuilder();
        if (stack.isEmpty()) {
            return "/";
        }
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.toString();
    }
}
