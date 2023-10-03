package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        return sum.multiply(percent.add(BigDecimal.valueOf(1)).pow(12))
                .setScale(9, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        // 500 руб. на счете
        BigDecimal sum = new BigDecimal(500).setScale(9, RoundingMode.HALF_UP);

        // 0.000001% ежемесячно
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, RoundingMode.HALF_UP);

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
