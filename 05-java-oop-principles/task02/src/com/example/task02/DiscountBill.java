package com.example.task02;

public class DiscountBill extends Bill {
    private double discount;

    @Override
    public long getPrice() {
        return super.getPrice() - getAbsDiscount();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        String string = super.toString();
        string += "\nСкидка - " + getDiscount() + "%\nБез скидки стоимость бы составила - " + super.getPrice();
        string += "\nВы сэкономили " + getAbsDiscount();
        return string;
    }

    public int getDiscount() {
        return (int) (discount * 100);
    }

    public long getAbsDiscount() {
        return (long) (super.getPrice() * discount);
    }
}
