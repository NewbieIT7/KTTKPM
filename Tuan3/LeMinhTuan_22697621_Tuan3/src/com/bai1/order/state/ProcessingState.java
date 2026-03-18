package com.bai1.order.state;

import com.bai1.order.context.OrderContext;

public class ProcessingState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("[System] Đang đóng gói và điều phối vận chuyển...");
        context.setState(new ShippedState());
    }
    @Override
    public String getStatusName() { return "ĐANG XỬ LÝ"; }
}