package com.example.task02;

public class DiscountBill extends Bill{

    private final double discountInPercent;

    public DiscountBill(double discountInPercent){
        if ( discountInPercent < 0 || discountInPercent > 100 )
            throw new IllegalArgumentException("Incorrect argument!");
        this.discountInPercent = discountInPercent;
    }

    public double getDiscountInPercent(){
        return discountInPercent;
    }

    @Override
    public long getPrice(){
        Long price = super.getPrice();
        return (long) (price - price * discountInPercent / 100);
    }

    public double getAbsoluteDiscount(){
        return super.getPrice() * discountInPercent / 100;
    }
}