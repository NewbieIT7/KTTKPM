package com.bai2.tax.strategy;

public class ExportTax implements RegionalTaxStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount * 0.95; // Ưu đãi thuế xuất khẩu giảm 5%
    }
}