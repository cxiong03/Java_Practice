package com.codewithchang;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) { // constructor injection
        this.calculator = calculator;
    }

    public void show(TaxCalculator calculator) { // method injection
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) { // setter injection
//        this.calculator = calculator;
//    }
}
