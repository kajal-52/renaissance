package com.programming.module3.twopointers;

public class DistinctRectanglesTwoPointer {
    public static void main(String[] args) {
        int[] sortedArray={2,3,5};
        int B=15;
        DistinctRectanglesTwoPointer rectanglesTwoPointer=new DistinctRectanglesTwoPointer();
        rectanglesTwoPointer.findNumberOfRectangles(sortedArray,B);

    }
    private void findNumberOfRectangles(int[] arr, int givenArea){
        int count =0;
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            int currentArea=arr[i]*arr[j];
            if (currentArea>=givenArea){
                j--;
            }else {
                int l=j-i+1;
                count+=2*l-1;
                i++;
            }
        }
        System.out.println(count);
    }
}
