package com.mmall.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public int romanToInt(String s) {
        if (s.equals(""))
            return 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        char[] chars = s.toUpperCase().toCharArray();
        int count = 0;
        int index = 0;
        while (index < chars.length) {
            if(index==chars.length-1){
                count+=map.get(String.valueOf(chars[index]));
                break;
            }
            if (map.get(String.valueOf(chars[index])) >= map.get(String.valueOf(chars[index+1]))) {
                count+=map.get(String.valueOf(chars[index]));
            } else {
                String carryStr = String.valueOf(s.charAt(index)) + String.valueOf(s.charAt(index + 1));
                count+=map.get(carryStr);
                index += 2;
                continue;
            }
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int res = solution13.romanToInt("IX");
        System.out.println(res);
    }
}
