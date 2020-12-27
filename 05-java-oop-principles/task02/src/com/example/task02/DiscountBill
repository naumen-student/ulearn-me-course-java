package com.example.task02;

public class DiscountBill extends Bill {
    private final long discount;

    public DiscountBill(long discount) {
        super();
        if (discount < 0 || discount > 100) throw new ArithmeticException(
                String.format("Data normalize not possible. Input: %s", discount));
        if (discount > 1){
            this.discount = discount / 100;
        }
        else
        {
            this.discount = discount;
        }
    }

    @Override
    public long getPrice() {
        return super.getPrice() * (1 - discount);
    }

    public long getAbsoluteDiscount(){
        return super.getPrice() - getPrice();
    }

    public long getPercentDiscount(){
        return discount * 100;
    }
}