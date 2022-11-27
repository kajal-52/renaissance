package com.programming.module2.arrays;
//TC O(N)
//SC= O(N)
public class RightRotateTheArray {
    public static void main(String[] args) {
        int[] values={5,0,1,4,2};
        int[] array=rightRotateTheArray(values,5,3);
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }
    }
    private static int[] rightRotateTheArray(int[] arr, int N, int K){
        int[] temp=new int[N];
        for (int i = 0; i < N; i++) {
            temp[(i+K)%N]=arr[i];
        }
        return temp;
    }
}
