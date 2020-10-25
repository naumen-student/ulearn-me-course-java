package com.example.task02;

public class DiscountBill extends Bill{
    private final double sale;

    public DiscountBill(double sale) {
        this.sale = sale;
    }

    public double getSale() {
        return sale;
    }

    public double getPriceWithSale(){
        double price = getPrice();
        return price - (price * sale / 100);
    }

    public double getFinalPrice(){
        return getPrice() - getPriceWithSale();
    }
}
