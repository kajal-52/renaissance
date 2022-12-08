package com.programming.module4.stack;
//Inbuilt stack
import java.util.Stack;

public class PushBottom {
    public static void main(String[] args) {

        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        pushBottom(5, integerStack);
        System.out.println(integerStack);

    }
    private static void pushBottom(int x, Stack<Integer> s){
        Stack<Integer> stack=new Stack<>();
        //to empty the stack and save into another
        //O(N)
        while (!s.empty()){
            int y=s.peek();
            s.pop();
            stack.push(y);
        }
        s.push(x);
        while (!stack.empty()){
            int z=stack.peek();
            stack.pop();
            s.push(z);
        }
    }

}
