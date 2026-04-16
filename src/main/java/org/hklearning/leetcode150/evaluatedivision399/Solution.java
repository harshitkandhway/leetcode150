package org.hklearning.leetcode150.evaluatedivision399;

import java.util.*;

public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(u).put(v, val);
            graph.get(v).put(u, 1.0 / val);
        }
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                results[i] = -1.0;
            } else if (start.equals(end)) {
                results[i] = 1.0;
            } else {
                results[i] = dfs(start, end, 1.0, graph, new HashSet<>());
            }
        }
        return results;
    }

    private double dfs(String curr, String target, double product,
                       Map<String, Map<String, Double>> graph, Set<String> visited) {
        visited.add(curr);
        double result = -1.0;
        Map<String, Double> neighbors = graph.get(curr);
        if (neighbors.containsKey(target)) {
            return product * neighbors.get(target);
        }
        for (Map.Entry<String, Double> entry : neighbors.entrySet()) {
            String nextNode = entry.getKey();
            if (visited.contains(nextNode)) continue;
            result = dfs(nextNode, target, product * entry.getValue(), graph, visited);
            if (result != -1.0) break;
        }
        return result;
    }
}
