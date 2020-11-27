package com.example.task02;

public class DiscountBill extends Bill {
    private int discount;

    public DiscountBill() {
        super();
    }

    public DiscountBill(int discount) {
        super();
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public long getDiscountAmount() {
        return getPrice() - getTotalCost();
    }

    public long getTotalCost() {
        return getPrice() * (100 - discount) / 100;
    }
}