package com.programming.module2.arrays;

public class MaximizeExpressionArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int p=1;
        int q=2;
        int r=3;
        MaximizeExpressionArray maximizeExpressionArray= new MaximizeExpressionArray();
        int output = maximizeExpressionArray.maximizeExpBruteForce(arr,p,q,r,5);
        System.out.println(output);
    }
    private int maximizeExpBruteForce(int[] values, int p, int q, int r, int N){
        int ans=0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j <N ; j++) {
                for (int k = j+1; k <N ; k++) {
                  ans=Math.max(ans, p*values[i]+q*values[j]+r*values[k]);
                }
            }
        }
        return ans;
    }
}
