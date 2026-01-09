package org.hklearning.leetcode150.mergesortedarray88;

import java.util.Arrays;

class Attempt2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i=0,j=0,t=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j])
                temp[t++]=nums1[i++];
            else
                temp[t++]=nums2[j++];
        }if(i==m && j<n){
            while(j<n)
                temp[t++]=nums2[j++];
        }if(j==n && i<m){
            while(i<m)
                temp[t++]=nums1[i++];
        }
        int l=0;
        while(l<m+n){
            nums1[l]=temp[l];
            l++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        merge(new int[]{0},0, new int[]{1},1);

    }
}