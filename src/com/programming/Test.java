package com.programming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        int X = 2;
        int Y = 3;
        String S = "bbggg";

        String out_ = twoColorBattle(X, Y, S);
        System.out.println(out_);
    }
    static String twoColorBattle(int X, int Y, String S){
        // Write your code here
        String result = "";
        List<Character> characters=new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            characters.add(new Character(S.charAt(i)));
            System.out.println(characters.get(i));
        }
        boolean ifPaulisWinner=isPaulWinner(characters);
        if(ifPaulisWinner==true){
            return "Blue";
        }
        return "Green";

    }
    public static boolean isPaulWinner(List<Character> chars){
        int j=0;
        while(j<chars.size()){
            System.out.println(j);
            if(chars.get(j)=='b'){
                System.out.println("Inside if");
                chars.remove((Character)'g');
                System.out.println(chars.size());
                j++;
            }else{
                chars.remove((Character)'b');
                j++;
            }
            if(j==chars.size()-1){
                if(chars.contains('b')&&chars.contains('g')){
                    j=0;
                }else if(chars.contains('b')&&(!chars.contains('g'))){
                    return true;
                }
                else if(!chars.contains('b')&&(chars.contains('g'))){
                    return false;
                }
            }
        }
        return false;
    }

}