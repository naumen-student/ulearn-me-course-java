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

        BigDecimal number = percent.add(BigDecimal.valueOf(1));
        BigDecimal multiplied = sum.multiply(number.pow(12));
        return multiplied.setScale(9, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
