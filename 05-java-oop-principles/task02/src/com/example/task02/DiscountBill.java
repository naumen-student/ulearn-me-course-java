package com.example.task02;

@SuppressWarnings("unused")
public class DiscountBill extends Bill {
    long discount;

    public DiscountBill(long discount) {
        super();
        if (discount < 0 || discount > 100) throw new ArithmeticException(
                String.format("Incorrect discount: %s", discount));
        this.discount = discount;
    }

    @Override
    public long getPrice() {
        return super.getPrice() * (1 - discount);
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }

    public long getPercDiscount() {
        return discount * 100;
    }
}
