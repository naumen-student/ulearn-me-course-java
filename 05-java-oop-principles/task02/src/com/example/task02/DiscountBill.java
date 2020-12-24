package com.example.task02;

public class DiscountBill extends Bill{
    private double discount;

    double getDiscountPrice(){
        return getPrice() * 1.0 * (100-discount);
    }

    private double getDiscount(){
        return discount;
    }

    private double getDiscountAbs(){
        return getPrice() - getDiscountPrice();
    }
}