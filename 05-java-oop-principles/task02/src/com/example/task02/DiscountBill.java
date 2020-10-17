package com.example.task02;

public class DiscountBill extends Bill {
    private double discount = 0;

    public double getDiscount() {
        return discount;
    }

    public DiscountBill(int discount) {
        this.discount = (100 - discount) / 100;
    }

    @Override
    public long getPrice() {
        return super.getPrice() - getDiscountAbsoluteValue();
    }

    public double getDiffer(){
        return super.getPrice() - getPrice();
    }

    public double getPercentDiscount() {
        return discount * 100;
    }

    public long getDiscountAbsoluteValue() {
        return (long) (super.getPrice() * discount);
    }
}
