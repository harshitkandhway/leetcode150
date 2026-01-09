package org.hklearning.leetcode150.mergesortedarray88;

import java.util.Arrays;

class Attempt1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m+n];
        int i=0,j=0,t=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[t]=nums1[i];
                i++;
                t++;
            } else{
                temp[t]=nums2[j];
                j++;
                t++;
            }
        }
        if(i==m && j<n){
            while(j<n){
                temp[t]=nums2[j];
                j++;
                t++;
            }
        }
        if(j==n && i<m){
            while(i<m){
                temp[t]=nums1[i];
                i++;
                t++;
            }
        }
        //nums1=temp;
        int l=0;
        while(l<m+n){
            nums1[l]=temp[l];
            l++;
        }

        System.out.println(Arrays.toString(nums1));
        //if n=0, default nums1 will be output

        //if nums1[m-1]<=nums2[0]; copy all the elements of nums2 from index m to m+n-1 in nums1

        //if nums1[0]>=nums2[n-1];copy all the content of nums1 in reverse order from index m+n-1 to n and
        //then copy content of nums2 from index n-1 to 0

        //always update nums1
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        merge(new int[]{0},0, new int[]{1},1);

    }
}