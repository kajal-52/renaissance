package com.programming.module8.lld.designprinc;

public class InternEmp extends Employee{
    protected InternEmp(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calSalaray() {
        return 0;
    }
}
