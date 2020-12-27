package com.example.task02;

public class DiscountBill extends Bill {

    private final double discountPercent;

    public DiscountBill(double discountPercent) {
        if (discountPercent >= 0 && discountPercent <= 100) {
            this.discountPercent = discountPercent;
        } else throw new IllegalArgumentException();
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public long getPrice() {
        double ratio = (100 - discountPercent) / 100.0;
        return (long) (super.getPrice() * ratio);
    }

    public double getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }
}
