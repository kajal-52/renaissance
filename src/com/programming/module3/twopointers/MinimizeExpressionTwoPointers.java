package com.programming.module3.twopointers;

public class MinimizeExpressionTwoPointers {
    public static void main(String[] args) {
       int[] arr={1,4,5,8,10};
       int[] brr={6,9,15};
       int[] crr={2, 3, 6,6};
       MinimizeExpressionTwoPointers m=new MinimizeExpressionTwoPointers();
       m.getMinValueOfExp(arr,brr,crr);
    }
    private void getMinValueOfExp(int[] arr, int[] brr, int[] crr){
        int ans=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int k=0;
        while (i<arr.length&&j<brr.length&&k<crr.length){
            int a = arr[i];
            int b = brr[j];
            int c = crr[k];
            int maxVal=Math.max(a, Math.max(b,c));
            int minVal=Math.min(a, Math.min(b,c));
            int minExpVal=maxVal-minVal;
            int idx=getMinValueIndex(a,b,c);
            if(idx==a){
                i++;
            }else if(idx==b){
                j++;
            }else{
                k++;
            }
            if (ans>minExpVal)
                ans = minExpVal;
        }
        System.out.println(ans);
    }

    public int getMinValueIndex(int a, int b, int c){
        if (a<b&&a<c){
            return a;
        }else if(b<a&&b<c){
            return b;
        }else {
            return c;
        }
    }
}
