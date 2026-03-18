package com.bai2.tax.decorator;
import com.bai2.tax.model.TaxableItem;

public class VATDecorator extends TaxDecorator {
    public VATDecorator(TaxableItem item) { super(item); }

    @Override
    public double getPrice() { return item.getPrice() * 1.1; } // Thuế 10%

    @Override
    public String getDescription() { return item.getDescription() + " [+VAT 10%]"; }
}