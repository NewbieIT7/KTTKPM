package com.bai2.tax.state;
import com.bai2.tax.context.TaxContext;

public class InvoicedState implements TaxState {
    @Override
    public void handle(TaxContext context) {
        System.out.println("[State] Đã xuất hóa đơn. Không thể thay đổi thuế nữa.");
    }

    @Override
    public String getStatus() { return "INVOICED (ĐÃ XUẤT HÓA ĐƠN)"; }
}