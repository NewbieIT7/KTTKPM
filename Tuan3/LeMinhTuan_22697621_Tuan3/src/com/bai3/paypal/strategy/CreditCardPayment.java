package com.bai3.paypal.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thực hiện thanh toán " + amount + " bằng Thẻ Tín Dụng.");
    }
}