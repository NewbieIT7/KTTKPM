package com.bai3.paypal.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thực hiện thanh toán " + amount + " qua cổng PayPal.");
    }
}