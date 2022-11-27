package com.programming.module3.twopointers;

public class MultipleXOR {
    public static void main(String[] args) {
        int[] arr= {2, 4, 32, 25 ,6 ,10};
        int i =2;
        int j=5;
        MultipleXOR multipleXOR=new MultipleXOR();
        multipleXOR.getSubarrayXor(arr,i,j);
    }
    private int getSubarrayXor(int[] arr, int i, int j){
        int ans=0;
        for (int k = i; k <j ; k++) {
            ans=ans^arr[k];
        }
        System.out.println(ans);
        return ans;
    }
}
