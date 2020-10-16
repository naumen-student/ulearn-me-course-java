package com.example.task02;

public class DiscountBill extends Bill {
    private final double discountFromPercents;

    public DiscountBill(double discountFromPercents) throws Exception {
        if (discountFromPercents < 0 || discountFromPercents > 100)
            throw new Exception("The discount value is out of range(0, 100)");
        this.discountFromPercents = discountFromPercents;
    }

    public double getDiscountFromPercents() {
        return discountFromPercents;
    }

    @Override
    public long getPrice(){
        return (long) (1 - discountFromPercents / 100) * super.getPrice();
    }

    public double getGetAbsoluteDiscount(){
        return super.getPrice() - getPrice();
    }

}
