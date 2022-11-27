package com.programming.module3.bitwise;

import java.util.Arrays;

/**
 * Given a sorted array arr[] of N positive integers having all the numbers occurring exactly
 * twice/even no of times, except for one number which will occur only once. Find the number
 * occurring only once
 *
 */
public class OddOneOut {
    public static void main(String[] args) {
        int[] inputValues= {4, 11,4,7,9,7,11};
        sortTheArray(inputValues);
        int oddOne = findOdd(inputValues);
        System.out.println(oddOne==-1?"Not found":"Found odd "+oddOne);
        findOddOneUsingBit(inputValues);
    }
    private static int findOdd(int[] arr){
        //O(N)
        int i=0;
        while(i<arr.length){
            if(i== arr.length-1)
                return arr[i];
            if (arr[i]!=arr[i+1]){
                return arr[i];
            }
            i=i+2;
        }
        return -1;
    }
    private static void sortTheArray(int[] arr){
        //O(N log N)
        Arrays.sort(arr);
    }
    private static void findOddOneUsingBit(int[] arr){
        //O(N)
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }

}
