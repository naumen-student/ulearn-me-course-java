package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(double discountPercent){
        this.discount = discountPercent;
    }

    public double getDiscount(){
        return discount;
    }

    public long GetPrice(){
        return super.getPrice() * ((100 - (long)discount) / 100);
    }

    public double Profit(){
        return super.getPrice() - this.GetPrice();
    }
}
