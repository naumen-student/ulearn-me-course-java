package com.example.task02;

public class DiscountBill extends Bill{
    private final float discount;

    public DiscountBill(float discount) throws Exception {
        final boolean discountCond = discount <= 100 && discount >= 0;
        if(discountCond){
            this.discount = discount;
        } else throw new Exception();
        assert discountCond;
    }

    public float getDiscount() {
        return discount;
    }

    public float getAbsolutePrice() {
        return this.getPrice()-this.getFinalPrice();
    }

    public float getFinalPrice() {
        float price = this.getPrice();
        return price * ((100 - discount) / 100);
    }
}
