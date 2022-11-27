package com.programming.module8.lld;

public class Person {
    //Naked objects
//    public int age;
    private int age;
    private double weight;
    private char gender;
    private Property property;

    public Person(int age, double weight, char gender, Property property) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.property = property;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0)
            this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight>0)
            this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ((gender=='M')||( gender=='F'))
            this.gender = gender;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                ", property=" + property +
                '}';
    }
}
