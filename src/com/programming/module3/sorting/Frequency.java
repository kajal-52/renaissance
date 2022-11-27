package com.programming.module3.sorting;
/*
Frequency object

 */
public class Frequency {
    private int frequency;
    private int element;
    private int index;

    public Frequency(int frequency, int element, int index) {
        this.frequency = frequency;
        this.element = element;
        this.index = index;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Frequency{" +
                "frequency=" + frequency +
                ", element=" + element +
                ", index=" + index +
                '}';
    }
}
