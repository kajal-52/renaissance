package com.programming.module4.queue;

public class Queue {
    int[] arr;
    int front;
    int rear;

    private void push(int x){
        if (isEmpty())
            System.out.println("Underflow");
        else {
            this.rear++;
            this.arr[rear]=x;

        }
    }
    private void pop(){
        if ((isFull()))
            System.out.println("Overflow");
        else
            this.front++;

    }
    private boolean isEmpty(){
        if (this.rear<this.front){
            return true;
        }
        return false;
    }
    private boolean isFull(){
        if (this.rear==arr.length-1){
            return true;
        }
        return false;
    }
}
