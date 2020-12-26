package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    @Override
    public long getPrice() {
        return (long) (super.getPrice() * (100 - discount) / 100);
    }

    public long GetAbsDiscount() {
        return super.getPrice() - getPrice();
    }

    public double getDiscount() {
        return discount;
    }
}
