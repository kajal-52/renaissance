package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequenceOptimized {
    public static void main(String[] args) {
        int[] nums = {5, 11, 3, 2, 6, 4};
        findLongestConsecutiveSequence(nums);
    }

    private static void findLongestConsecutiveSequence(int[] arr) {
        int ans = 0;
        Map<Integer, Integer> streaks = new HashMap<>();
        Map<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            streaks.put(arr[i],1);
        }
        for (int j = 0; j < arr.length; j++) {
            if (!streaks.containsKey(arr[j]-1)){
                if (!visited.containsKey(arr[j])){
                    int len=0;
                    int x=arr[j];
                    visited.put(arr[j],1);
                    while(streaks.containsKey(x)){
                        len++;
                        x++;
                    }
                    ans=Math.max(ans,len);
                }
            }
        }
        System.out.println(ans);
    }
}
