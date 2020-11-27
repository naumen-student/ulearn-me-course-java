package com.example.task02;

public class DiscountBill extends Bill {
    public int discount;

    public DiscountBill(int discount){
        this.discount = discount;
    }

    public int getDiscount(){
        return discount;
    }

    public long totalPrice(){
        return super.getPrice() * 100 * (100 - discount) / 10000;
    }

    public long absoluteValueDiscount(){
        return super.getPrice() - totalPrice();
    }
}
