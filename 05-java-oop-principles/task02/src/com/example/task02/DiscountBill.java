package com.example.task02;


public class DiscountBill extends Bill{
    private final double discount;
    private final double discountAmount;

    public DiscountBill(double discount){
        this.discount = discount;
        discountAmount = getPrice() * discount;
    }
    public double getPriceWithDiscount(){
        return getPrice() - getPrice() * discount ;
    }

    public String getDiscount(){
        return discount * 100 + ("%");
    }

    public double getDiscountAmount(){
        return discountAmount;
    }
}
