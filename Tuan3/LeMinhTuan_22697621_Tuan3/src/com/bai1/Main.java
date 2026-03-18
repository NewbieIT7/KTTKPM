package com.bai1;

import com.bai1.order.context.OrderContext;
import com.bai1.order.model.*;
import com.bai1.order.decorator.*;
import com.bai1.order.strategy.*;

public class Main {
    public static void main(String[] args) {
        // --- DECORATOR PATTERN ---
        // Tạo đơn hàng cơ bản và bọc thêm Bảo hiểm
        OrderComponent myOrder = new SimpleOrder();
        myOrder = new InsuranceDecorator(myOrder);

        // --- KHỞI TẠO CONTEXT ---
        OrderContext context = new OrderContext(myOrder);

        // Xem thông tin ban đầu
        context.showOrderSummary();

        // --- STATE PATTERN: Chuyển sang "ĐANG XỬ LÝ" ---
        context.nextStep();

        // --- STRATEGY PATTERN: Chọn cách giao hàng ---
        context.setStrategy(new ExpressShipping());
        context.executeShipping();

        // --- STATE PATTERN: Chuyển sang "ĐÃ GIAO" ---
        context.nextStep();

        // Xem kết quả cuối cùng
        context.showOrderSummary();
    }
}