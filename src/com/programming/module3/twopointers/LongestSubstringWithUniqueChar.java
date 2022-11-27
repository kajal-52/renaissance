package com.programming.module3.twopointers;

public class LongestSubstringWithUniqueChar {
    public static void main(String[] args) {
        String input = "abcdefcgkltmpq";
        int length = 14;
        LongestSubstringWithUniqueChar l=new LongestSubstringWithUniqueChar();
        int lengthOfSubs = l.findSubstringBruteForce(input,length);
        System.out.println(lengthOfSubs);
    }
    private int findSubstringBruteForce(String s, int len){
        int ans=0;
        int[] frequencies=new int[256];
        intializeArray(frequencies);
        for (int i = 0; i < len; i++) {
            intializeArray(frequencies);
            for (int j = i; j <len ; j++) {
                if (frequencies[s.charAt(j)]>=1){
                    break;
                }else {
                    frequencies[s.charAt(j)]++;
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private void intializeArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
    }
}
