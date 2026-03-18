package com.bai3.paypal.state;

import com.bai3.paypal.context.OrderContext;

public class ProcessingState implements OrderState {
    @Override
    public void handlePayment(OrderContext context) {
        System.out.println("-> Trạng thái: Đang xử lý. Đang gọi Strategy thanh toán...");
        context.getPaymentMethod().pay(context.getAmount());
        context.setState(new CompletedState());
    }
}