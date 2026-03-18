package com.bai2.tax.decorator;
import com.bai2.tax.model.TaxableItem;

public abstract class TaxDecorator implements TaxableItem {
    protected TaxableItem item;
    public TaxDecorator(TaxableItem item) { this.item = item; }
}