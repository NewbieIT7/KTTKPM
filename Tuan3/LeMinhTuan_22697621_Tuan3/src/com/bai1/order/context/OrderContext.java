package com.bai1.order.context;

import com.bai1.order.model.OrderComponent;
import com.bai1.order.state.OrderState;
import com.bai1.order.state.NewOrderState;
import com.bai1.order.strategy.ShippingStrategy;

public class OrderContext {
    private OrderState state;
    private OrderComponent details;
    private ShippingStrategy strategy;

    public OrderContext(OrderComponent details) {
        this.details = details;
        this.state = new NewOrderState(); // Khởi tạo với trạng thái mặc định
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void nextStep() {
        System.out.println("\n--- Tiến trình: " + state.getStatusName() + " ---");
        state.handle(this);
    }

    public void executeShipping() {
        if (strategy != null) {
            strategy.performShipping();
        } else {
            System.out.println("(!) Chưa chọn phương thức vận chuyển.");
        }
    }

    public void showOrderSummary() {
        System.out.println("------------------------------------");
        System.out.println("MÔ TẢ: " + details.getDescription());
        System.out.println("TỔNG CHI PHÍ: $" + details.getCost());
        System.out.println("TRẠNG THÁI HIỆN TẠI: " + state.getStatusName());
        System.out.println("------------------------------------");
    }
}