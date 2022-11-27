package com.programming.module8.lld.designprinc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new FTH(1));
        employees.add(new InternEmp(2));
        employees.add(new ContractEmp(3));
        employees.add(new Volunteer(4));
        SalaryDisburser salaryDisburser=new SalaryDisburser();
        salaryDisburser.disburseSalary(employees);
    }
}
