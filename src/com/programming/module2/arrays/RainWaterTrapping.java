package com.programming.module2.arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int numOfPillars=12;
        int[] heightsOfPillars={0,1,0,2,1,0,1,3,2,1,2,1};
        RainWaterTrapping trapping=new RainWaterTrapping();
        int[] prefA=trapping.prefixMaxArray(heightsOfPillars,numOfPillars);
        int[] sufA=trapping.suffixMaxArray(heightsOfPillars,numOfPillars);
        trapping.findWaterTrappedInPillars(heightsOfPillars,numOfPillars,prefA,sufA);

    }
    public void findWaterTrappedInPillars(int[] arr,int N,int[] suffixMax, int[] prefixMax){
        int waterTrapped=0;
        for (int i = 1; i <N-1 ; i++) {
            int h1=prefixMax[i];
            int h2=suffixMax[i];
            int decided_h;
            if(h1<h2){
                 decided_h=h1;
            }else{
                decided_h=h2;
            }
            if (decided_h>arr[i]){
                waterTrapped+=decided_h-arr[i];
            }
        }
        System.out.println(waterTrapped);
    }
    private int[] prefixMaxArray(int[] arr,int n){
        int[] prefixArray=new int[n];
        int max=arr[0];
        prefixArray[0]=max;
        for (int i = 1; i <n ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
            prefixArray[i]=max;
        }
        return prefixArray;
    }
    private int[] suffixMaxArray(int[] arr,int n){
        int[] suffixArray=new int[n];
        int max=arr[n-1];
        suffixArray[n-1]=max;
        for (int i = n-2; i >0 ; i--) {
            if (max<arr[i]){
                max=arr[i];
            }
            suffixArray[i]=max;
        }
        return suffixArray;
    }
}
