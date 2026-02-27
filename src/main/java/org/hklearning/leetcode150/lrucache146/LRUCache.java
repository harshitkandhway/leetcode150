package org.hklearning.leetcode150.lrucache146;

import java.util.LinkedHashMap;

public class LRUCache {
    private LinkedHashMap<Integer, Integer> mapper;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mapper = new LinkedHashMap<Integer, Integer>(capacity,1,true);
    }

    public int get(int key) {
        return mapper.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        if(mapper.keySet().size()==capacity && !mapper.containsKey(key)){
            mapper.remove(mapper.keySet().iterator().next());
        }
        mapper.put(key,value);
    }
}
