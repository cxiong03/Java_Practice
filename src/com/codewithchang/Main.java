package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        Employee newEmployee = new Employee();
        newEmployee.baseSalary = 50_000;
        newEmployee.hourlyRate = 20;
        int wage = newEmployee.calculateWage(10);
        System.out.println(wage);
    }
}

