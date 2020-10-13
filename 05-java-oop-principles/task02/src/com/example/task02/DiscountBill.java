package com.example.task02;

public class DiscountBill extends Bill {

    private int discount;

    public DiscountBill(int discount) {
        if (discount >= 0 && discount <= 100)
            this.discount = discount;
    }

    public double getDiscount() {
        return this.discount;
    }

    public long getPriceWithDiscount() {
        return (super.getPrice() * ((100 - this.discount) / 100));
    }


    public long getAmountOfDiscount() {
        return super.getPrice() - this.getPriceWithDiscount();
    }
}

