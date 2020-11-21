package com.example.task02;

import java.util.ArrayList;
import java.util.List;

public class DiscountBill extends Bill {
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public double getDiscountPrice() {
        return getPrice() * (1 - discount / 100);
    }

    public double getAbsoluteDiscount() {
        return getPrice() - getDiscountPrice();
    }
}
