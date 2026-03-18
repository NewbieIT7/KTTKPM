package com.bai2.tax.strategy;

public class DomesticTax implements RegionalTaxStrategy {
    @Override
    public double calculateTotal(double amount) { return amount; }
}