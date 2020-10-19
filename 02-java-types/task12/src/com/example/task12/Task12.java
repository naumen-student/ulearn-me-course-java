package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        BigDecimal percents = percent.add(new BigDecimal("1.0")).pow(12);
        return sum.multiply(percents).setScale(9, RoundingMode.HALF_UP);

    }

    public static void main(String[] args) {

    }

}
