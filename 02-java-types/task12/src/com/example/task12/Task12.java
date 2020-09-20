package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        sum = sum.multiply(new BigDecimal(Math.pow(1 + percent.doubleValue(), 12)));
        return sum.setScale(9, RoundingMode.HALF_UP);
    }
}