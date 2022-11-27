package com.programming.module3.twopointers;
/*
Finding pairs for a given sum in array using two pointers
(i) -whether such pair exists or not
(ii)- how many such pairs exist in the array
 */
import java.util.Arrays;

public class TargetSumUsingTwoPointers {
    public static void main(String[] args) {
        int[] values={1,5,7,1};
        int targetSum =6;
        sortGivenValues(values);
        boolean isPairFound=isPairWithGivenSumFound(values,targetSum);
        System.out.println("If any pair with given sum exists: "+isPairFound);
    }
    public static void sortGivenValues(int[] values){
        Arrays.sort(values);
    }
    public static boolean isPairWithGivenSumFound(int[] values, int targetSum){
        int firstPointer=0;
        int secondPointer= values.length-1;
        while (firstPointer<secondPointer){
            int currentPairSum=values[firstPointer]+values[secondPointer];
            if (currentPairSum<targetSum){
                firstPointer++;
            }else if(currentPairSum>targetSum){
                secondPointer--;
            }else {
                return true;
            }
        }
        return false;
    }
}