package com.programming.module8.lld.designprinc;

public abstract class Employee {
    protected final int employeeId;

    protected Employee(int employeeId) {
        this.employeeId = employeeId;
    }
    protected abstract double calSalaray();
}
