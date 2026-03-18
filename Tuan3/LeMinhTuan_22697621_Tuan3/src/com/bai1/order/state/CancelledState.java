package com.bai1.order.state;

import com.bai1.order.context.OrderContext;

public class CancelledState implements OrderState {
    @Override public void handle(OrderContext c) { System.out.println("[System] Đơn hàng này đã bị hủy, không thể xử lý tiếp."); }
    @Override public String getStatusName() { return "ĐÃ HỦY"; }
}