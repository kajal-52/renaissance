package com.programming.module3.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*

 */

public class CustomStringSort {
    public static void main(String[] args) {
        String order= "kqep";
        String s= "pekeq";
        int[] rank =new int[26];// rank array declared
        for (int i = 0; i <25 ; i++) { //rank array intialised with INT_MAX value for 26 alphabets
            rank[i]=Integer.MAX_VALUE;
        }
        List<Pair> pair=new ArrayList<>();// list of pairs
        for (int j = 0; j <order.length() ; j++) { //
            int idx=order.charAt(j)-'a'; //
            rank[idx]=j;

        }
        for (int k = 0; k < s.length(); k++) {
            pair.add(new Pair(s.charAt(k),rank[s.charAt(k)-'a']));
//            System.out.println(pair.get(k).toString()); yes
        }
        Collections.sort(pair,new StringComparator());
        String str="";
        for (Pair p:pair) {
            str+=p.getC();
            System.out.println(p.toString());
        }
        for(int l=str.length();l<s.length();l++){
            str+=s.charAt(l);
        } //okay 1 minute

        System.out.println(str);
    }
}
class StringComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair p1,Pair p2) {
        return Integer.compare(p1.getR(),p2.getR()); //yes
    }

}
