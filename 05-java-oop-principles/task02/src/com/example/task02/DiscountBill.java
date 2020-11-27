package com.example.task02;

public class DiscountBill extends Bill {
    private double sale;

    public double getPriceWithSale() {
        long price = getPrice();
        return price - price * sale;
    }

    public double getSaleAsPercent() {
        return sale * 100;
    }

    public double getSaleAsAbsolute() {
        return getPrice() * sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
