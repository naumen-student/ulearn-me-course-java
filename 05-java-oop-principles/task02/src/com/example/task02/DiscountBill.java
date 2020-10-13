package com.example.task02;

public class DiscountBill extends Bill{
    private int percentDiscount;

    public DiscountBill(int percentDiscount){
        this.percentDiscount = percentDiscount;
    }

    public long getPriceWithDiscount(){
        return getPrice() - getPrice() / (100 * percentDiscount);
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public long getAbsoluteValue(){
        return getPrice() - getPriceWithDiscount();
    }
}
