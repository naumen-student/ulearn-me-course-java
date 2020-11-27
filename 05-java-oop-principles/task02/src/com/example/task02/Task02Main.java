package com.example.task02;

class DiscountBill extends Bill {

    public double discount;

    public long getTotalPrice() {
        long price = getPrice();
        return price - price * (long) discount / 100;
    }

    public double getDiscountPercent() {
        return discount;
    }

    public long getAbsDiscount() {
        return getPrice() - getTotalPrice();
    }
}
