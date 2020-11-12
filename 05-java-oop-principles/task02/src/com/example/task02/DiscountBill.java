package com.example.task02;

public class DiscountBill extends Bill {
    private final double discountInPcts;

    public DiscountBill(double discountInPcts) {
        this.discountInPcts = discountInPcts;
    }

    public double getDiscountInPcts(){
        return discountInPcts;
    }

    public double GetPrice(){
        return super.getPrice()*((100 - discountInPcts) / 100);
    }

    public double AbsoluteDiscount(){
        return super.getPrice() - this.GetPrice();
    }
}
