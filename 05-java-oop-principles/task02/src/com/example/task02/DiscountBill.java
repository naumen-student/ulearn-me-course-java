package com.example.task02;

import java.security.InvalidParameterException;

public class DiscountBill extends Bill
{
    private int discount;

    public void setPercentOfDiscount(int discount)
    {
        if (discount<0 || discount>100)
            throw  new InvalidParameterException(discount+"Is invalid discount");
        this.discount = discount;
    }

    public  int getPercentOfDiscount()
    {
        return  discount;
    }

    public long getAbsoluteDiscount()
    {
        long price = super.getPrice();
        return price-price*discount/100;
    }

    public long getAbsoluteDiscount(int discount)
    {
        this.setPercentOfDiscount(discount);
        return  getAbsoluteDiscount();
    }

    @Override
    public long getPrice()
    {
        return super.getPrice()*(discount==0?1:discount/100);
    }

    public long getPrice(int discount)
    {
        setPercentOfDiscount(discount);
        return this.getPrice();
    }
}
