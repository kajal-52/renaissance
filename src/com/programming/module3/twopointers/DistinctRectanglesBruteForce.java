package com.programming.module3.twopointers;

public class DistinctRectanglesBruteForce {
    public static void main(String[] args) {
        int[] sortedArray={2,3,5};
        int B=15;
        DistinctRectanglesBruteForce rectangles=new DistinctRectanglesBruteForce();
        int numberOfRectangles=rectangles.findNumberOfRectangles(sortedArray,B);
        System.out.println(numberOfRectangles);
    }
    private int findNumberOfRectangles(int[] arr, int area){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]*arr[j]<area){
                    count++;
                }
            }
        }
        return count;
    }
}
