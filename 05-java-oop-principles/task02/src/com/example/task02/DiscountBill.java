package com.example.task02;

public class DiscountBill extends Bill {

    private final double discount;

    public DiscountBill(double discount) {
        this.discount = discount;
    }

    public double price() {
        return (super.getPrice() - super.getPrice() * discount / 100);
    }

    public double getDiscount() {
        return discount;
    }

    public double absoluteDiscount() {
        return super.getPrice() - price();
    }
}
