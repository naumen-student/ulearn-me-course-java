package com.example.task02;

public class DiscountBill extends Bill {
    private int dicsount;

    @Override
    public long getPrice() {
        long sum = super.getPrice();
        return sum*(100-dicsount);
    }

    public int getDicsount() {
        return dicsount;
    }

    public long getAbsoluteDiscount(){
        return super.getPrice() - getPrice();
    }
}
