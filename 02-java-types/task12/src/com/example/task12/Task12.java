package com.example.task12;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Task12 {

    public static float benefit(float sum, float percent) {
        BigDecimal percents = percent.add(BigDecimal.valueOf(1)).pow(12);
        return sum.multiply(percents).setScale(9, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {

        System.out.println("Сумма на счете через год: " + sum);

    }

}
