package com.example.task02;

public class DiscountBill extends Bill {
    private final double sale;

    public DiscountBill(double sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        long sum = getPrice();
        return "Сумма к оплате: " + (sum - sum * sale);
    }

    public double getPercentSale() {
        return sale * 100;
    }

    public double getAbsoluteSale() {
        return getPrice() * sale;
    }
}
