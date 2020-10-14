package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalPrice() {
        return super.getPrice() * (100 - discount) * 0.01;
    }

    public double getAbsoluteDiscount() {
        return super.getPrice() - this.getFinalPrice();
    }
}
