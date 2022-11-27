package com.programming.module3.bitwise;
/*
Check whether ith bit is set or unset
1st approach == remainder method
time complexity = O(log n)
2nd approach bitwise

 */
public class CheckithBit {
    public static void main(String[] args) {
        int num=9;
        int i=2;
        CheckithBit checkithBit=new CheckithBit();
//        int res=checkithBit.checkIfBitIsSet(num,i);
        int res= checkithBit.checkIfBitSetBitwise(num, i);
        if(res==1){
            System.out.println("Set");
        }else
            System.out.println("Unset");
    }
    private int checkIfBitIsSet(int num, int i){
        for (int j = 0; j < i; j++) {
            num=num/2;
        }
        return num%2;
    }
    private int checkIfBitSetBitwise(int n, int position){
        int mask=1<<position;
        return (n&mask);
    }
}
