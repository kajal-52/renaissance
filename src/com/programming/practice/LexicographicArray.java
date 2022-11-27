package com.programming.practice;

public class LexicographicArray {
    public static void main(String[] args) {
        int[] arr={1,2, 16, 15};
        findLexicographic(arr);
    }
    private static void findLexicographic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int xor=arr[i]^arr[j];
                if (xor%2!=0 && arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

}
