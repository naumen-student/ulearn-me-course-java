package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        if (discount > 100 || discount < 0) {
            throw new IllegalArgumentException("Скидка невозможна");
        }
        this.discount = discount;
    }

    public double discountPrice() {
        return super.getPrice() - super.getPrice() * discount / 100;
    }

    public double getDiscount() {
        return discount;
    }

    public double absoluteDiscount() {
        return super.getPrice() - discountPrice();
    }
}
