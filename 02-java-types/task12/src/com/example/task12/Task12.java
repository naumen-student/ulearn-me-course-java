package com.example.task12;

import java.math.BigDecimal;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        // TODO раскомментируйте и исправьте код

        for (int i = 1; i <= 12; i++) {
            sum = sum.add(sum.multiply(percent));
        }

        return sum.setScale(9, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(1000).setScale(9, BigDecimal.ROUND_HALF_UP);
        BigDecimal percent = new BigDecimal(1).setScale(9, BigDecimal.ROUND_HALF_UP);
        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
