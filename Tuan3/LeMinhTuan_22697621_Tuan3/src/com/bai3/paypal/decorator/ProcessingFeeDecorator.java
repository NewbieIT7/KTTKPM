package com.bai3.paypal.decorator;

import com.bai3.paypal.strategy.PaymentStrategy;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private double fee;

    public ProcessingFeeDecorator(PaymentStrategy strategy, double fee) {
        super(strategy);
        this.fee = fee;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[Phụ phí] Cộng thêm phí xử lý: " + fee);
        super.pay(amount + fee);
    }
}