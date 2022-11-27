package com.programming.module2.arrays;
//TC ---> O(N^2)
public class RotateTheArray {
    public static void main(String[] args) {
        int[] values={5,0,1,4,2};
        int[] array=rightRotateTheArray(values,5,3);
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }
    }
    private static int[] rightRotateTheArray(int[] arr, int N, int K){
        for (int i = 0; i <= N%K; i++) {
            int temp=arr[N-1];
            for (int j = N-2; j >=0 ; j--) {
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
        return arr;
    }
}
