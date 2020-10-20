package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(int discount) {
        this.discount = discount;
    }

    public double discountPrice(){
        return getPrice() * (1 - discount / 100);
    }

    public double getDiscount(){
        return discount;
    }

    public double absDiscount(){
        return getPrice() - discountPrice();
    }
}
