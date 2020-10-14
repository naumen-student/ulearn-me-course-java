package com.example.task02;

import java.util.ArrayList;
import java.util.List;

public class DiscountBill extends Bill{
    private List<Item> items = new ArrayList<>();
    private double discount;

    public DiscountBill(int discount){
        this.items = new ArrayList<>();
        this.discount = discount;
    }

    @Override
    public long getPrice() {
        long beforeDiscount = super.getPrice();
        return (long)(beforeDiscount - beforeDiscount * (this.discount / 100));
    }

    public double getDiscount(){
        return this.discount;
    }

    public long getValueOfDiscount(){
        return (long)(super.getPrice() * (this.discount / 100));
    }
}
