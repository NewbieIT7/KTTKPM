package com.bai1.order.state;

import com.bai1.order.context.OrderContext;

public class NewOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("[System] Đang kiểm tra thông tin thanh toán...");
        context.setState(new ProcessingState());
    }
    @Override
    public String getStatusName() { return "MỚI TẠO"; }
}