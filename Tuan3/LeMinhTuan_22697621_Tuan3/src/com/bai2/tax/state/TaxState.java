package com.bai2.tax.state;
import com.bai2.tax.context.TaxContext;

public interface TaxState {
    void handle(TaxContext context);
    String getStatus();
}