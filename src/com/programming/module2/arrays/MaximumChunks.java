package com.programming.module2.arrays;

import java.util.Scanner;
/*
You are given an integer array arr of length n that represents a permutation of the integers in
the range [0,n−1]
We split arr into some number of chunks (i.e., partitions), and individually sort each chunk.
After concatenating them, the result should equal the sorted array.
Print the largest number of chunks we can make to sort the array
 */
public class MaximumChunks {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int[] values=new int[N];
        for(int i=0;i<N;i++){
            values[i]=sc.nextInt();
        }
        findMaxChunks(values);

    }
    public static int findMaxChunks(int[] unsortedValues){
        int count=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < unsortedValues.length; i++) {
            max=findMax(max,unsortedValues[i]);
            if (max==i)
                count++;
        }
        System.out.println(count);
        return count;
    }
    public static int findMax(int a, int b){
        if (a<b){
            return b;
        }
        return a;
    }
}
