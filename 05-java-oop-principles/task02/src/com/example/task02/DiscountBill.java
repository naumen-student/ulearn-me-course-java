package com.example.task02;

public class DiscountBill extends Bill {

    private final long discount;

    public DiscountBill(long discount){
        this.discount = discount;
    }

    @Override
    public long getPrice(){
        return super.getPrice() - discount;
    }

    public double getDiscountPercentage(){
        return getPrice()/super.getPrice() * 100;
    }

    public long AbsoluteDiscountValue(){
        return super.getPrice() - getPrice();
    }
}
