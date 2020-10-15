package com.example.task02;

public class DiscountBill extends Bill{
    private double Discount;

    public double getDiscount(){
        return this.Discount;
    }

    public double getDiffer(){
        return super.getPrice() - getPrice();
    }

    public long getFinalPrice() {
        return super.getPrice() - (long) (super.getPrice() * Discount);
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }
}
