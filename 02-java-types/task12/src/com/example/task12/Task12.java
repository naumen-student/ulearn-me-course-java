package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        // TODO раскомментируйте и исправьте код

        // Считаем проценты за год

        BigDecimal percents = percent.add(new BigDecimal(1.0)).pow(12);
        return sum.multiply(percents).setScale(9, RoundingMode.HALF_UP);


        //return BigDecimal.ZERO;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
