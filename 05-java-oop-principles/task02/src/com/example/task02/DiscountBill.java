package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(long discount) {
        if (discount < 0 || discount > 100)
            throw new IllegalArgumentException("Error");
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public long getPrice() {
        return (long) (super.getPrice() - super.getPrice() * discount / 100);
    }

    public double absoluteDiscount() {
        return super.getPrice() * discount / 100;
    }
}
