package com.mmall.leetcode;

public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < (32 - 1); i++) {
            if(n==1<<i){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Solution231 solution231 = new Solution231();
        boolean res = solution231.isPowerOfTwo(218);
        System.out.println(res);
        System.out.println(1<<1);
    }
}
