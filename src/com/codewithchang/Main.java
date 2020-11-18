package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        TaxCalculator2020 calculator = new TaxCalculator2020(100_000);
        TaxReport report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2021());
    }
}

