package com.example.task02;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.concurrent.ExecutionException;

public class DiscountBill extends Bill {
    private final double discount;

    public DiscountBill(double discount) {
        if (!(discount >= 0 && discount <= 1))
            throw new Error("discount must be [0, 1]");
        this.discount = discount;
    }

    public int getPersentDiscount() {
        return (int)(discount * 100);
    }

    public double getTotalDiscount() {
        return super.getPrice() - totalCost();
    }

    public double totalCost() {
        return (1 - discount) * super.getPrice();
    }
}
