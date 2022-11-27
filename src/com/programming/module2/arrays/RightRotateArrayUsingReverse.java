package com.programming.module2.arrays;
// TC O(N)
/*
7 3
1 2 3 4 5 6 7
 */
public class RightRotateArrayUsingReverse {
    public static void main(String[] args) {
        int[] values={1,2,3,4,5,6,7};
        int[] array=rightRotateTheArray(values,7,3);
        for (int i = 0; i < 7; i++) {
            System.out.print(array[i]+" ");
        }
    }
    private static int[] rightRotateTheArray(int[] arr, int N, int K){
        reverseTheArray(arr,0,N-K);
        reverseTheArray(arr,N-K,N);
        reverseTheArray(arr,0,N);
        return arr;
    }
    private static void reverseTheArray(int[] arr, int start, int end){
        int idx = 1;
        for (int i = start; i <(start+end)/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[end-idx];
            arr[end-idx]=temp;
            idx++;
        }
        for (int i = start; i < end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
