package com.mmall.leetcode;

import java.util.HashMap;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> map = new HashMap();
        for(int i=0;i< S.length();i++){
            char c = S.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int result = 0;
        for(int i=0;i< J.length();i++){
            char j = J.charAt(i);
            if(map.containsKey(j)){
                result+=map.get(j);
            }

        }
        return result;


    }

    public int numJewelsInStones1(String J, String S) {
        int  res = 0;
        int[] hash= new int[300];
        for(char s:S.toCharArray()){
            hash[s]++;
        }
        for(char j:J.toCharArray()){
            if(hash[j]!=0){
                res+=hash[j];
                hash[j]=0;
            }
        }


        return res;


    }

    public static void main(String[] args) {
        Solution771 s = new Solution771();
        int result = s.numJewelsInStones("aA", "aAAbbbb");
        System.out.println(result);
    }
}
