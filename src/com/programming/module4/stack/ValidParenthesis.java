package com.programming.module4.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<String> paranthesis=new Stack<>();
        paranthesis.push("(");
        paranthesis.push("[");
        paranthesis.pop();
    }


}
