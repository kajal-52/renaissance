package com.programming.module8.lld;

import java.util.Date;

public class KeywordTest {
    public static void main(String[] args) {
        //primitive data types
        final int x;
        x=0;
        final String s= "good";
        // Non primitive
        final Date date=new Date();
        System.out.println(date.getTime());
        date.setTime(System.currentTimeMillis());
        System.out.println(date.getTime());
    }
}
