package com.example.task02;

public class DiscountBill extends Bill {
    private int discount;

    public DiscountBill(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public double getTotalCost() {
        return super.getPrice() * ((100 - discount) / 100);
    }

    public double absoluteValueDiscount() {
        return super.getPrice() - this.getTotalCost();
    }
}
