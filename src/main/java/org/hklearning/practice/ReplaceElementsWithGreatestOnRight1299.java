package org.hklearning.practice;

public class ReplaceElementsWithGreatestOnRight1299 {
    public int[] replaceElements(int[] arr) {
        int max = -1,maxAfter=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(max<arr[i])
                max = arr[i];
            arr[i]=maxAfter;
            maxAfter=max;
        }
        return arr;
    }
}
