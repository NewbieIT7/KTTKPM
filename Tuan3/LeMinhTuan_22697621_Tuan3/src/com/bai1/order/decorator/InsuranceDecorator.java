package com.bai1.order.decorator;
import com.bai1.order.model.OrderComponent;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(OrderComponent order) { super(order); }

    @Override
    public double getCost() { return decoratedOrder.getCost() + 100.0; }

    @Override
    public String getDescription() { return decoratedOrder.getDescription() + " + Bảo hiểm rủi ro"; }
}