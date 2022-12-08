package com.programming.module4.stack;

public class Stack {
    private int[] arr;
    private int top;

    public Stack() {
        this.top=-1;
    }
    private void push(int ele){
        if (isFull()){
            System.out.println("Overflow");
        }else {
            top++;
            this.arr[top] = ele;
        }
    }
    private void pop(){
        if (isEmpty())
            System.out.println("Underflow");
        top--;
    }
    private int top(){
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        else
            return this.arr[top];
    }
    private boolean isEmpty(){
        if (this.top==-1)
            return true;
        return false;
    }
    private boolean isFull(){
        if (this.top==this.arr.length-1){
            return true;
        }
        return false;
    }

}
