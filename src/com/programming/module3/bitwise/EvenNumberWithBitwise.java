package com.programming.module3.bitwise;

import java.util.Scanner;

public class EvenNumberWithBitwise {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if((num&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
