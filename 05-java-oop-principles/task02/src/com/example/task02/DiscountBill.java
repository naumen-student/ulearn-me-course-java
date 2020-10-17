package com.example.task02;

public class DiscountBill extends Bill
{
    private final double discountInPercent;

    public DiscountBill(double discountInPcts)
    {
        this.discountInPercent = discountInPcts;
    }

    public double getDiscountInPercent()
    {
        return discountInPercent;
    }

    public double GetPrice()
    {
        return super.getPrice()*((100 - discountInPercent) / 100);
    }

    public double AbsoluteDiscount()
    {
        return super.getPrice() - this.GetPrice();
    }
}