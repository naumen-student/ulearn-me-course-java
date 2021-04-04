package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;
    private final double discountAmount;

    public DiscountBill(double discount){
        this.discount = discount;
        discountAmount = getPrice() * discount / 100;
    }
    public double getPriceWithDiscount(){
        return getPrice() - discountAmount ;
    }

    public double getDiscount(){
        return discount;
    }

    public double getDiscountAmount(){
        return discountAmount;
    }
}
