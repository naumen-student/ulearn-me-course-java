package com.example.task12;

import java.math.BigDecimal;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        // TODO раскомментируйте и исправьте код

        // Считаем проценты за год

        /*
        for (int i = 1; i <= 12; i++) {
            sum += sum * percent;
        }
        return sum;
        */
        int monthCount = 12;
        return new BigDecimal(1)
                .add(percent)
                .pow(monthCount)
                .multiply(sum)
                .setScale(9,BigDecimal.ROUND_HALF_UP);
    }
}
