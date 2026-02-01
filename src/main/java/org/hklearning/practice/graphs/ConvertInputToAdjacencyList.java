package org.hklearning.practice.graphs;

import java.util.*;

public class ConvertInputToAdjacencyList {
    public static void main(String[] args) {
        int[][] ar = {{2, 4}, {1, 3}, {2, 1}, {1, 2}};
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int[] a : ar){
            int x = a[0];
            int y = a[1];
            if(adjList.containsKey(x)){
                adjList.get(x).add(y);
            } else{
                adjList.put(x, new ArrayList<>(List.of(y)));
            }
        }
        for (int i : adjList.keySet()) {
            System.out.println(STR."\{i} : \{adjList.get(i)}");
        }
    }
}
