package com.bai2;

import com.bai2.tax.model.*;
import com.bai2.tax.decorator.*;
import com.bai2.tax.strategy.*;
import com.bai2.tax.context.TaxContext;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo sản phẩm gốc (1000$)
        TaxableItem myItem = new BaseProduct("Xe máy SH", 1000);

        // 2. Áp các loại thuế (Decorator)
        myItem = new VATDecorator(myItem);         // 1000 + 10% = 1100
        myItem = new LuxuryTaxDecorator(myItem);  // 1100 + 20% = 1320

        // 3. Đưa vào Context xử lý với thuế nội địa (Strategy)
        TaxContext taxSystem = new TaxContext(myItem, new DomesticTax());
        taxSystem.showBill();

        // 4. Thay đổi chiến lược sang xuất khẩu
        System.out.println(">> Đổi sang chiến lược xuất khẩu...");
        taxSystem.setStrategy(new ExportTax());
        taxSystem.showBill();

        // 5. Chuyển sang trạng thái Đã xuất hóa đơn (State)
        taxSystem.process();

        // 6. Thử thay đổi chiến lược sau khi chốt (Sẽ bị lỗi)
        taxSystem.setStrategy(new DomesticTax());
        taxSystem.showBill();
    }
}