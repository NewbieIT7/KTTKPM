package com.bai3.paypal.model;

public class Order {
    private String id;
    private double baseAmount;

    public Order(String id, double baseAmount) {
        this.id = id;
        this.baseAmount = baseAmount;
    }

    public double getBaseAmount() { return baseAmount; }
}