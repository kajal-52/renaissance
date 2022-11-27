package com.programming.module8.lld;

public class PersonTest {
    public static void main(String[] args) {
        Property property=new Property(100, 2000);
        Person person =new Person(20, 50, 'M', property);
        printPerson(person);
    }
    public static void printPerson(Person person){
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getWeight());
        System.out.println(person.getProperty().getBankbalance());
        System.out.println(person.getProperty().getInvestments());
    }
}
