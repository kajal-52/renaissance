package com.programming.module3.sorting;
/*
Pair object
 */
public class Pair {
    char c; //charactor from string
    int r; // rank of string

    public Pair(char c, int r) {
        this.c = c;
        this.r = r;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "c=" + c +
                ", r=" + r +
                '}';
    }
}


