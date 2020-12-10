package com.example.task02;

public class DiscountBill extends Bill {
    private int sale;

    public DiscountBill(int sale) {
        this.sale = sale;
    }

    public int get_DiscountBill

    {
        return sale;
    }

    public long getPrice() {
        return super.getPrice() - super.getPrice() * sale / 100;
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }
}