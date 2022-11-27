package com.programming.module8.lld.designprinc;

public class Volunteer extends Employee{
    protected Volunteer(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calSalaray() {
        return 0;
    }
}
