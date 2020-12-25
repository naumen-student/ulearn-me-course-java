package com.example.task02;

public class DiscountBill extends Bill{

    private long discount;

    public DiscountBill(long discount) {
        if (0 <= discount && discount <= 100) {
            this.discount = discount;
        }
    }

    public long getDiscount(){
        return this.discount;
    }

    public long getPriceWithDisc(){
        return super.getPrice() * (1 - discount / 100);
    }

    public long getAbsolute(){
        return super.getPrice() - this.getPriceWithDisc();
    }
}
