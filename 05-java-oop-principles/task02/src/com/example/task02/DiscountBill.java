package com.example.task02;

public class DiscountBill extends Bill {
    private final float discount;

    public DiscountBill(float discount) {
        if (discount < 0 || discount > 100)
            throw new IllegalArgumentException("The discount must be greater than 0 and less than 100%");
        this.discount = discount;
    }

    @Override
    public long getPrice() {
        return (long) (super.getPrice() * (100 - discount) / 100);
    }

    public long GetAbsDiscount() {
        return super.getPrice() - getPrice();
    }

    public float getDiscount() {
        return discount;
    }
}
