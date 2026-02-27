package org.hklearning.leetcode150.lrucache146;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 {
    private LinkedHashMap<Integer, Integer> mapper;

    public LRUCache2(int capacity) {
        mapper = new LinkedHashMap<Integer, Integer>(capacity,1,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return mapper.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        mapper.put(key,value);
    }
}
