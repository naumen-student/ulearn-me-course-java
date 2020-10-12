package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        if(discount < 0 || discount > 100)
            throw new IllegalArgumentException("Неверное значение скидки");
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public long getPrice() {
        return (long) (super.getPrice() * (1 - discount / 100));
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }
}
