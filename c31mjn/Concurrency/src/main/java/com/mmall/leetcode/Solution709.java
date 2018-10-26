package com.mmall.leetcode;

public class Solution709 {

    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c:str.toCharArray()){
            if(65<=c && c<=90){
                c = (char)(c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution709 solution709 = new Solution709();
        String abc = solution709.toLowerCase("AbC");
        System.out.println(abc);
    }
}
