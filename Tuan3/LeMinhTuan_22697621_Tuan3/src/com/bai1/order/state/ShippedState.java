package com.bai1.order.state;

import com.bai1.order.context.OrderContext;

public class ShippedState implements OrderState {
    @Override public void handle(OrderContext c) { System.out.println("[System] Đơn hàng đã hoàn tất giao hàng."); }
    @Override public String getStatusName() { return "ĐÃ GIAO"; }
}
