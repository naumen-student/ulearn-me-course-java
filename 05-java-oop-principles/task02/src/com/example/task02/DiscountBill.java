package com.example.task02;

public class DiscountBill extends Bill {
    private int discount;

    public DiscountBill(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public long totalPrice() {
        return super.getPrice() - super.getPrice()*discount/100;
    }

    public long absoluteDiscount() {
        return super.getPrice() - totalPrice();
    }
}
