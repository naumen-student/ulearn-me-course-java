package com.example.task02;

public class DiscountBill extends Bill{
    private double discount;

    double getDiscountPrice(){
        return getPrice() - getPrice() * (long)discount/100;
    }

    private double getDiscount(){
        return discount;
    }

    private double getDiscountAbs(){
        return getPrice() - getDiscountPrice();
    }
}