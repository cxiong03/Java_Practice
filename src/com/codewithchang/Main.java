package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        TaxCalculator2020 calculator = new TaxCalculator2020(100_000);
        TaxReport report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2021());
        report.show();
    }
}

