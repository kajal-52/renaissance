package com.programming.module2.arrays;

public class MaximumChunksBruteForce {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,3,5};
        MaximumChunksBruteForce maximumChunksBruteForce=new MaximumChunksBruteForce();
        maximumChunksBruteForce.divideInMaxChunks(arr);
    }
    private void divideInMaxChunks(int[] arr){
        int i=0;
        int ans=0;
        int N=arr.length;
        while (i<N){
            for (int j = i; j < N; j++) {
                boolean canBeChunked=canBeChunked(arr,i,j);
                System.out.println(canBeChunked);
                if (canBeChunked){
                    break;
                }
                i=j+1;
                ans++;
            }
        }
        System.out.println(ans);
    }

    private boolean canBeChunked(int[] arr,int i, int j) {
        int count=0;
        for (int k = i; k < j; k++) {
            System.out.println(arr[k]);
            if (arr[k]>=i&& arr[k]<=j)
                count++;
        }
        if (count==j-i+1){
            return true;
        }
        return false;
    }
}
