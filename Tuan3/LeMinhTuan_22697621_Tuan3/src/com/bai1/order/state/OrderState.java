package com.bai1.order.state;

import com.bai1.order.context.OrderContext;

public interface OrderState {
    void handle(OrderContext context);
    String getStatusName();
}