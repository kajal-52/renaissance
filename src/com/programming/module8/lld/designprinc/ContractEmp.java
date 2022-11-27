package com.programming.module8.lld.designprinc;

public class ContractEmp extends Employee{
    protected ContractEmp(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calSalaray() {
        return 0;
    }
}
