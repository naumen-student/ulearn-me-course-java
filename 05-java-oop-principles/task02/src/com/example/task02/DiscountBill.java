package com.example.task02;

public class DiscountBill extends Bill {

    private final int discount;

    public DiscountBill(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public double getFinalPrice() {
        double price = getPrice();
        return price - (price * discount / 100);
    }

    public double getAbsoluteDiscount() {
        return getPrice() - getFinalPrice();
    }
}
