package com.example.task02;

public class DiscountBill extends Bill {

    private final double discountInPercentage;

    public DiscountBill(long discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }

    public double getDiscountInPercentage() {
        return discountInPercentage;
    }

    public long getAbsoluteDiscountValue() {
        return super.getPrice() - this.getPrice();
    }

    @Override
    public long getPrice() {
        return super.getPrice() - getAbsoluteDiscountValue();
    }
}
