package com.bai3.paypal.state;

import com.bai3.paypal.context.OrderContext;

public class CompletedState implements OrderState {
    @Override
    public void handlePayment(OrderContext context) {
        System.out.println("-> Trạng thái: Hoàn tất. Cảm ơn quý khách!");
    }
}