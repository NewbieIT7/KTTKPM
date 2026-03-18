package com.bai1.order.strategy;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public void performShipping() {
        System.out.println("=> Giao hàng Hỏa tốc: Nhận hàng trong 24h.");
    }
}