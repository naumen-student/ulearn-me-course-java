package com.example.task02;

public class DiscountBill extends Bill{
    private final int discount;
    public DiscountBill(int discount){
        if( discount < 0 && discount > 100)
            throw new IllegalArgumentException("Error argument!");
        this.discount = discount;
    }

    public int getDiscount(){
        return discount;
    }

    public double  totalСost(){
        return super.getPrice() - super.getPrice() * getDiscount() / 100;
    }

    public double abcolutPrise(){
        return super.getPrice() - this.totalСost();
    }

}
