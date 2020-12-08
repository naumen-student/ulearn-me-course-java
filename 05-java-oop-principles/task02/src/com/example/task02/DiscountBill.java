package com.example.task02;

public class DiscountBill extends Bill {
    private double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return super.getPrice() * ((100 - discount) / 100);
    }

    public double getDiscount() {
        return discount;
    }

    public double absDiscount() {
        return super.getPrice() - getDiscountedPrice();
    }
}