package com.bai2.tax.context;

import com.bai2.tax.model.TaxableItem;
import com.bai2.tax.strategy.RegionalTaxStrategy;
import com.bai2.tax.state.*;

public class TaxContext {
    private TaxableItem product;
    private RegionalTaxStrategy strategy;
    private TaxState state;

    public TaxContext(TaxableItem product, RegionalTaxStrategy strategy) {
        this.product = product;
        this.strategy = strategy;
        this.state = new DraftState();
    }

    public void setState(TaxState state) { this.state = state; }

    public void setStrategy(RegionalTaxStrategy strategy) {
        if (state instanceof DraftState) {
            this.strategy = strategy;
        } else {
            System.err.println("(!) LỖI: Hóa đơn đã chốt, không được đổi chiến lược thuế.");
        }
    }

    public void process() {
        state.handle(this);
    }

    public void showBill() {
        double price = strategy.calculateTotal(product.getPrice());
        System.out.println("================================");
        System.out.println("TRẠNG THÁI: " + state.getStatus());
        System.out.println("SẢN PHẨM: " + product.getDescription());
        System.out.println("GIÁ CUỐI CÙNG: $" + String.format("%.2f", price));
        System.out.println("================================\n");
    }
}