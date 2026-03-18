package com.bai3.paypal.context;

import com.bai3.paypal.state.NewOrderState;
import com.bai3.paypal.state.OrderState;
import com.bai3.paypal.strategy.PaymentStrategy;

public class OrderContext {
    private OrderState state;
    private double amount;
    private PaymentStrategy paymentMethod;

    public OrderContext(double amount) {
        this.amount = amount;
        this.state = new NewOrderState(); // Trạng thái ban đầu
    }

    public void setState(OrderState state) { this.state = state; }

    public void setPaymentMethod(PaymentStrategy method) { this.paymentMethod = method; }
    public PaymentStrategy getPaymentMethod() { return paymentMethod; }

    public double getAmount() { return amount; }

    public void process() {
        state.handlePayment(this);
    }
}