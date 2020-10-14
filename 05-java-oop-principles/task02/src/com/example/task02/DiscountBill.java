package com.example.task02;

public class DiscountBill extends Bill {
    private final int discountPercent;

    public DiscountBill(int discountPercent) throws IllegalArgumentException {
        if (discountPercent > 100 || discountPercent < 0) throw new IllegalArgumentException();
        this.discountPercent = discountPercent;
    }

    @Override
    public long getPrice() {
        return super.getPrice() - getAbsoluteDiscount();
    }

    public int getDiscount(){
        return discountPercent;
    }

    public long getAbsoluteDiscount(){
        return super.getPrice() * discountPercent / 100;
    }
}
