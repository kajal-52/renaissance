package com.programming.module3.twopointers;

public class LongestSubstringWithUniqueCharTwoPointers {
    public static void main(String[] args) {
        String input = "pwwkew";
        int length = 6;
        LongestSubstringWithUniqueCharTwoPointers l=new LongestSubstringWithUniqueCharTwoPointers();
        l.findSubsWithTwoPointers(input,length);
    }

    private void findSubsWithTwoPointers(String s, int len){
        int ans=1;
        int i=0, j=0;
        int[] frequencies=new int[256];
        intializeArray(frequencies);
        frequencies[s.charAt(0)]++;
        while (j<len-1){
            if (frequencies[s.charAt(j+1)]==0){
                j++;
                frequencies[s.charAt(j)]++;

            }else {
                frequencies[s.charAt(i)]--;
                i++;
            }
            ans=Math.max(ans, j-i);
        }
        System.out.println(ans);
    }
    private void intializeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

}
