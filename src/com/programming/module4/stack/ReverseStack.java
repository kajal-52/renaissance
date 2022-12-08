package com.programming.module4.stack;
/**
 * Write a program to reverse a stack using recursion. You are not allowed to use loop constructs like while, for.. etc., and you can only use the following functions on Stack S:
 * isEmpty(S)
 * push(S)
 * pop(S)
 */

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        reverseAStack(integerStack);
        System.out.println(integerStack);
    }
    private static void reverseAStack(Stack<Integer> s){
        if (s.empty()){
            return;
        }
        int y=s.peek();
        s.pop();
        reverseAStack(s);
        PushBottomUsingRecursion.pushBottom(y,s);
    }
}
