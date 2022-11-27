package com.programming.module3.bitwise;

/**
 * check whether a number is power of 2 or not
 *
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int num=64;
        boolean res=checkIfPowerOfTwo(num);
        System.out.println(res);
        int output= checkIfPowerOfTwoBit(num);
        System.out.println(output);
    }
    private static boolean checkIfPowerOfTwo(int N){
        //O(log n) loop approach
        int i=1;
        while (true){
            if (i<N){
                i=i<<1;
            }else if( i> N){
                 return false;
            }else {
                return true;
            }
        }
    }
    private static int checkIfPowerOfTwoBit(int n){
        // bit manipulation approach
        return (n>0&&(n&(n-1))==0)?1:0;
    }
}
