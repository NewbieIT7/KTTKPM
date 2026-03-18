package com.bai3.paypal.decorator;

import com.bai3.paypal.strategy.PaymentStrategy;

public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy decoratedStrategy;

    public PaymentDecorator(PaymentStrategy strategy) {
        this.decoratedStrategy = strategy;
    }

    public void pay(double amount) {
        decoratedStrategy.pay(amount);
    }
}