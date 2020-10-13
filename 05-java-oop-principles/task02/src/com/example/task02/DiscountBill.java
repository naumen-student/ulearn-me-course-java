package com.example.task02;

public class DiscountBill extends Bill {
    private int discount;

    public void setDiscount(int discount) { this.discount = Math.min(discount, 100); }

    public int getDiscount() { return discount; }

    public long getPrice() { return super.getPrice() - getAbsoluteDiscount(); }

    public long getAbsoluteDiscount() { return super.getPrice() * discount / 100; }
}
