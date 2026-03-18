package com.bai2.tax.state;
import com.bai2.tax.context.TaxContext;

public class DraftState implements TaxState {
    @Override
    public void handle(TaxContext context) {
        System.out.println("[State] Đang ở bản nháp. Chốt hóa đơn...");
        context.setState(new InvoicedState());
    }

    @Override
    public String getStatus() { return "DRAFT (BẢN NHÁP)"; }
}