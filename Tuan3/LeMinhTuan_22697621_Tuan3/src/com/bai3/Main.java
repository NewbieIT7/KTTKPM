package com.bai3;

// Import các thành phần từ package con paypal
import com.bai3.paypal.context.OrderContext;
import com.bai3.paypal.strategy.*;
import com.bai3.paypal.decorator.*;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext(2000.0);

        PaymentStrategy myCard = new CreditCardPayment();

        myCard = new ProcessingFeeDecorator(myCard, 20.0);
        myCard = new DiscountDecorator(myCard, 100.0);

        order.setPaymentMethod(myCard);

        order.process();
        order.process();
        order.process();
    }
}