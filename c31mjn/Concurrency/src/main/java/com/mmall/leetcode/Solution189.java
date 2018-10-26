package com.mmall.leetcode;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        for (int i = 0; i < nums.length; i++) {
            int i1 = (i + k) % nums.length;
        }
    }

}
