package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    public long getDiscountPrice() {
        return (long)(getPrice() * (100 - discount) / 100);
    }

    public double getDiscountPercent() {
        return discount;
    }

    public long getDiscountSum() {
        return getPrice() - getDiscountPrice();
    }
}
