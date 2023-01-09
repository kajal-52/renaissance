package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
public class LongestConsecutiveSequenceUsingHashMap {
    public static void main(String[] args) {
        int[] nums={5,11,3,2,6,4};
        findLongestConsecutiveSequence(nums);

    }
    private static void findLongestConsecutiveSequence(int[] arr){
        int ans=0;
        Map<Integer,Integer> streaks=new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if(!streaks.containsKey(arr[j])){
                int ls=0;
                int rs=0;
                if (streaks.containsKey(arr[j]-1)){
                    ls=streaks.get(arr[j]-1);
                }
                if (streaks.containsKey(arr[j]+1)){
                    rs=streaks.get(arr[j]+1);
                }
                int val=1+ls+rs;
                ans=Math.max(ans,val);
                streaks.put(arr[j],val);
                streaks.put(arr[j]-ls,val);
                streaks.put(arr[j]+rs,val);
            }
        }
        System.out.println(ans);
    }
}
