package com.bai3.paypal.state;

import com.bai3.paypal.context.OrderContext;

public interface OrderState {
    void handlePayment(OrderContext context);
}