package com.example.task12;

import java.math.BigDecimal;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        for (int i = 1; i <= 12; i++) {
            BigDecimal percentRound = sum.multiply(percent)
                    .setScale(9, BigDecimal.ROUND_HALF_UP);
            sum = sum.add(percentRound);
        }
        return sum;



    }

    public static void main(String[] args) {
    }
}
