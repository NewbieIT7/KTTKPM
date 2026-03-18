package com.bai3.paypal.state;

import com.bai3.paypal.context.OrderContext;

public class NewOrderState implements OrderState {
    @Override
    public void handlePayment(OrderContext context) {
        System.out.println("-> Trạng thái: Mới. Chuyển sang xử lý thanh toán.");
        context.setState(new ProcessingState());
    }
}