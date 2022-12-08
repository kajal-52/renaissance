package com.programming.module4.stack;

import java.util.Stack;

public class PushBottomUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        pushBottom(5, integerStack);
        System.out.printf("%s ",integerStack.toString().replace("["," ").replace("]"," ").replace(","," "));
    }
    public static void pushBottom(int s, Stack<Integer> stack){
        //O(N)

        if(stack.empty()){
            stack.push(s);
            return;
        }
        int x=stack.peek();
        stack.pop();
        pushBottom(s,stack);
        stack.push(x);
    }
}
