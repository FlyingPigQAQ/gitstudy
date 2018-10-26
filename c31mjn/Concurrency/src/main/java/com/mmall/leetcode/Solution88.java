package com.mmall.leetcode;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =m-1;
        int j = n-1;
        int k = nums1.length-1;
        while (i>=0 && j>=0){
            if(nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }

        for (int num:nums1
             ) {
            System.out.print(num+",");

        }

    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2,5,6};
        Solution88 solution88 = new Solution88();
        solution88.merge(nums1,3,nums2,3);

    }
}
