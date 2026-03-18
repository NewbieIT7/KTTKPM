package com.bai1.order.decorator;
import com.bai1.order.model.OrderComponent;

public abstract class OrderDecorator implements OrderComponent {
    protected OrderComponent decoratedOrder;
    public OrderDecorator(OrderComponent order) { this.decoratedOrder = order; }
}