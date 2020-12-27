package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(double discount){
        this.discount = discount;
    }

    public double GetDiscount(){
        return this.discount;
    }

    public double EndPrice(){
        return getPrice() - this.AbsDiscountBill ();
    }

    public double AbsDiscountBill(){
        return getPrice() * this.discount / 100;
    }
}