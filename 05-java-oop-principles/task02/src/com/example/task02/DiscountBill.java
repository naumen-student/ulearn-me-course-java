package com.example.task02;

public class DiscountBill extends Bill {

    private final double discountPercentage;

    public DiscountBill(double discountPercentage){
        if (discountPercentage >= 0 && discountPercentage <= 100)
            this.discountPercentage = discountPercentage;
        else
            throw new IllegalArgumentException("Размер скидки должен быть в диапазоне от 0 до 100");
    }

    public double getDiscountPercentage(){
        return discountPercentage;
    }

    @Override
    public long getPrice() {
        return (long)(super.getPrice() * (100 - discountPercentage)/ 100);
    }

    public long absoluteDiscount(){
        return (long)(super.getPrice() * discountPercentage/ 100);
    }
}
