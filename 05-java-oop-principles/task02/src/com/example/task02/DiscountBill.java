package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        if (discount >= 0 && discount <= 100) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("Incorrect discount!");
        }
    }

    public double getDiscountPrice() {
        long price = super.getPrice();
        return price * (1 - discount / 100);
    }

    public double getDiscount() {
        return discount;
    }

    public double getAbsoluteDiscount() {
        return super.getPrice() - getDiscountPrice();
    }
}
