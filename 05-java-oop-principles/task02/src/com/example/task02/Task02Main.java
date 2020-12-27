package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public double getDiscount(){
        return discount;
    }

    public DiscountBill(double discount){
        if (discount < 0 || discount > 100)
            throw new IllegalArgumentException("Скидка может быть от 0 до 100");
        this.discount = discount;
    }

    public long getPrice(){
        return (long)(1-discount / 100) * super.getPrice();
    }
    public double getAbsoluteDiscount(){
        return super.getPrice() - getPrice();
    }

}
