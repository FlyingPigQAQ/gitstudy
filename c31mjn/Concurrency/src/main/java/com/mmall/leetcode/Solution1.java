package com.mmall.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] nums ={3,3};
        int target = 6;
        int[] ints = solution1.twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
