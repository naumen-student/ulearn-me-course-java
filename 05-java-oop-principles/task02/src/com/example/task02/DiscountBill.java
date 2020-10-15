package com.example.task02;

public class DiscountBill extends Bill {
    public final float discount;
    public DiscountBill(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public float getFinalPrice() {
        float price = getPrice();
        return price * ((100 - discount) / 100);
    }

    public float getAbsolutePrice() {
        return getPrice()-getFinalPrice();
    }
}


