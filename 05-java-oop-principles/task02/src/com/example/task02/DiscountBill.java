package com.example.task02;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        if (discount >= 0 && discount <= 100)
            this.discount = discount;
        else
            throw new IllegalArgumentException("Скидка должна быть в диапазоне от 0 до 100");
    }

    public long getPrice() {
        return (long) (super.getPrice() * (100 - discount) / 100.0);
    }

    public double getDiscount() {
        return discount;
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }
}
