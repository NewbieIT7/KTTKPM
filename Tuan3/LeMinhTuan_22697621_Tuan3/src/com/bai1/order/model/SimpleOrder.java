package com.bai1.order.model;

public class SimpleOrder implements OrderComponent {
    @Override
    public double getCost() { return 1000000.0; } // Giá gốc 1000000

    @Override
    public String getDescription() { return "Đơn hàng điện tử"; }
}