package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getAbsDiscount() {
        double price = getPrice();
        return price - (price * discount / 100);
    }

    public double getEndPrice() {
        return getPrice() - getAbsDiscount();
    }
}
