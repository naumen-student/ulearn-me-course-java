package com.example.task02;

public class DiscountBill extends Bill {
    private final float discount;

    public DiscountBill(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public float getAbsolutePrice() {
        return getPrice() - getDiscountedPrice();
    }

    public float getDiscountedPrice() {
        return getPrice() * ((100 - discount) / 100f);
    }
}
