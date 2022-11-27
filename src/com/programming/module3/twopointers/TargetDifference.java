package com.programming.module3.twopointers;

import java.util.Arrays;
/*
Finding pairs for a given difference in array using brute force approach i.e. considering all possible pairs and its difference
(i) -whether such pair exists or not
(ii)- how many such pairs exist in the array
Time complexity -O(N^2)
 */

public class TargetDifference {
    public static void main(String[] args) {
    int[] values={5, 20, 3, 2, 5, 80};
    int targetDifference =15;
    sortGivenValues(values);
    boolean isPairFound=isPairWithGivenDifferenceFound(values,targetDifference);
    System.out.println("If any pair with given difference exists: "+isPairFound);
}
    public static void sortGivenValues(int[] values){
        Arrays.sort(values);
    }
    public static boolean isPairWithGivenDifferenceFound(int[] values, int targetDifference){
        int firstPointer=0;
        int secondPointer= values.length-1;
        while (firstPointer<secondPointer){
            int currentPairDiffrence=values[secondPointer]-values[firstPointer];
            if (currentPairDiffrence>targetDifference){
                firstPointer++;
            }else if(currentPairDiffrence<targetDifference){
                secondPointer--;
            }else {
                return true;
            }
        }
        return false;
    }
}
