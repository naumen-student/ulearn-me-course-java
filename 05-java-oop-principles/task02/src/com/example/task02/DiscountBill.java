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
        string += "\n������ - " + getDiscount() + "%\n��� ������ ��������� �� ��������� - " + super.getPrice();
        string += "\n�� ���������� " + getAbsDiscount();
        return string;
    }

    public int getDiscount() {
        return (int) (discount * 100);
    }

    public long getAbsDiscount() {
        return (long) (super.getPrice() * discount);
    }
}
