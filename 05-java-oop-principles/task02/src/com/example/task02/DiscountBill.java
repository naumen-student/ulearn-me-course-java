package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(float discount) {
        if (discount < 0 || discount > 100)
            throw new IllegalArgumentException("Wrong number");
        this.discount = discount;
    }

    @Override
    public long getPrice() {
        return (long) (super.getPrice() * (100 - discount) / 100);
    }

    public double getDiscount() {
        return discount;
    }

    public long GetAbsDiscount() {
        return super.getPrice() - getPrice();
    }

}
