package com.programming.module3.bitwise;

/**
 * Given two integers left and right that represent the range [left, right],
 * return the bitwise AND of all numbers in this range, inclusive.
 */
public class CumulativeBItwiseAND {
    public static void main(String[] args) {
        int L=9;
        int R=14;
        bitwiseAndFromLtoR(L,R);
        bitwiseAndFromLtoRUsingMask(L, R);
        bitwiseAndFromLtoRUsingMaskOptimized(L,R);
    }
    private static int bitwiseAndFromLtoR(int L, int R){
        //O(R-L)
        int ans=L;
        for (int i = L+1; i <R ; i++) {
            ans=ans&i;
        }
        System.out.println(ans);
        return ans;
    }
    private static long bitwiseAndFromLtoRUsingMask(int L, int R){
        //O(R-L)
        long ans=(1l<<32)-1;
        for (int i = L; i <R ; i++) {
            ans=(ans&i);
        }
        System.out.println(ans);
        return ans;
    }
    private static long bitwiseAndFromLtoRUsingMaskOptimized(int L, int R){
        //O(32)
        int ans=0;
        long mask=(1l<<31);
        while (mask>0){
            if((L&mask)==(R&mask)){
                if ((L&mask)!=0){
                    ans+=mask;
                }
                mask=(mask>>1);
            }else{
                break;
            }
        }
        return ans;
    }
}
