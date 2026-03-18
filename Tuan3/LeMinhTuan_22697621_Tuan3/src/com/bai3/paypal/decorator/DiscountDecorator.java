package com.bai3.paypal.decorator;

import com.bai3.paypal.strategy.PaymentStrategy;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;

    public DiscountDecorator(PaymentStrategy strategy, double discount) {
        super(strategy);
        this.discount = discount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[Giảm giá] Áp dụng mã giảm giá: -" + discount);
        super.pay(amount - discount);
    }
}