package com.example.task02;

public class DiscountBill extends Bill {

    private final long discount;

    public DiscountBill(long discount) {
        this.discount = discount;
    }

    public long getDiscount() { return discount; }

    public long getPriceWithDiscount(){
        return super.getPrice() * (1 - discount / 100);
    }

    public long getFinalPrice(){
        return super.getPrice() - this.getPriceWithDiscount();
    }
}
