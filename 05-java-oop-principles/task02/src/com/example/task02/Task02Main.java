package com.example.task02;

public class Task02Main extends Bill{
    private final int discount;

    public Task02Main(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public long getPrice(){
        long price = super.getPrice();
        return price - (long) (price / 100 * discount);
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - getPrice();
    }
}