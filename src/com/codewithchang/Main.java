package com.codewithchang;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee(
                50_000, 30);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}

