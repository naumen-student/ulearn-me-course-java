package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount){
        if (discount < 0 || discount > 100)
            throw new Error("Discount must be [0, 100]");
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;
    }

    public double getFinalPrice(){
        return super.getPrice() * (1 - discount / 100);
    }

    public double getAbsolutePrice(){
        return super.getPrice() - this.getFinalPrice();
    }
}
