package com.programming.module3.twopointers;

import java.util.Arrays;

public class TargetDifferenceUsingTwoPointers {
    public static void main(String[] args) {
        int[] values={5, 20, 3, 2, 5, 80};
        int targetDifference =15;
        sortGivenValues(values);
        boolean isPairFound=isPairWithGivenSumFound(values,targetDifference);
        System.out.println("If any pair with given sum exists: "+isPairFound);
    }
    public static void sortGivenValues(int[] values){
        Arrays.sort(values);
    }
    public static boolean isPairWithGivenSumFound(int[] values, int targetDiff){
        int firstPointer=0;
        int secondPointer= 1;
        while (secondPointer< values.length){
            int currentPairDiff=0;
            currentPairDiff=values[secondPointer]-values[firstPointer];
            if (currentPairDiff<targetDiff){
                secondPointer++;
            }else if(currentPairDiff>targetDiff){
                firstPointer++;
                if (firstPointer==secondPointer){
                    secondPointer++;
                }
            }else {
                return true;
            }
        }
        return false;
    }
}
