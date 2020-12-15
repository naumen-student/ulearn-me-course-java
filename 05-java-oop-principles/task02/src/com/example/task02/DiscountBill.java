package com.example.task02;

import java.math.BigDecimal;

public class DiscountBill extends Bill{
    private BigDecimal discount;

    public DiscountBill(BigDecimal discount){
        this.discount = discount;
    }

   public long getPrice(){
        return (new BigDecimal(1).add(discount.multiply(new BigDecimal(0.01)))).longValue()*super.getPrice();
    }

    public double getAbsPrice(){
        return super.getPrice() - getPrice();
    }

}