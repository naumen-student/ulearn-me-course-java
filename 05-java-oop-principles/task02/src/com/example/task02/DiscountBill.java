package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double absoluteDiscount() {
        return super.getPrice() - getPrice();
    }

    public long getPrice() {
        return (long) (1 - discount / 100) * super.getPrice();
    }
}
