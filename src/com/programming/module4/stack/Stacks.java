package com.programming.module4.stack;

public class Stacks {
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        if(!isFull(sq)){
            sq.top1+=1;
            System.out.println(sq.top1);
            sq.arr[sq.top1]=x;

        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(!isFull(sq)){
            sq.top2--;
            System.out.println(sq.top2);
            sq.arr[sq.top2]=x;
        }

    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        if(isEmpty1(sq))
            return -1;
        else{
            int pop1=sq.arr[sq.top1];
            sq.top1--;
            return pop1;
        }
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        if(isEmpty2(sq))
            return -1;
        else {
            int pop2=sq.arr[sq.top2];
            sq.top2++;
            return pop2;
        }
    }
    boolean isFull(TwoStack sq){
        if(sq.top2-sq.top1==1){
            return true;
        }
        return false;
    }
    boolean isEmpty1(TwoStack sq){
        if(sq.top1==-1){
            return true;
        }
        return false;
    }
    boolean isEmpty2(TwoStack sq){
        if(sq.top2==sq.size){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stacks stacks=new Stacks();
        TwoStack twoStack=new TwoStack();
        stacks.push1(2,twoStack);
        System.out.println(twoStack.arr[twoStack.top1]);
        stacks.push1(3,twoStack);
        stacks.push2(4,twoStack);
        System.out.println(stacks.pop1(twoStack));
        System.out.println(stacks.pop2(twoStack));
        System.out.println(stacks.pop2(twoStack));
    }


}
