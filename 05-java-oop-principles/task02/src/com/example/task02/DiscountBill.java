package com.example.task02;

public class DiscountBill extends Bill{
    private final int discount;

    public DiscountBill(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public long getPrice(){
        long price = super.getPrice();
        return price - (long) (price / 100 * discount);
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }
}