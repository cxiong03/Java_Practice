package com.codewithchang;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Employee newEmployee = new Employee();
        newEmployee.setBaseSalary(50_000);
        newEmployee.setHourlyRate(20);
        int wage = newEmployee.calculateWage(10);
        System.out.println(wage);
    }
}

