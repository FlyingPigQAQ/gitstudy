package com.mmall.leetcode;

public class Solution35 {
    public int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target<=nums[i]){
                return i;
            }

        }
        return nums.length;
    }
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int i = new Solution35().searchInsert(nums, target);
        System.out.println(i);
    }
}
