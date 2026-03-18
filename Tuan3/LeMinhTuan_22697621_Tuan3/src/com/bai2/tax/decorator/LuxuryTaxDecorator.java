package com.bai2.tax.decorator;
import com.bai2.tax.model.TaxableItem;

public class LuxuryTaxDecorator extends TaxDecorator {
    public LuxuryTaxDecorator(TaxableItem item) { super(item); }

    @Override
    public double getPrice() { return item.getPrice() * 1.2; } // Thuế 20%

    @Override
    public String getDescription() { return item.getDescription() + " [+Luxury Tax 20%]"; }
}