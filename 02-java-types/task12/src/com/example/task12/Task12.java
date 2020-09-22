package com.example.task12;

import java.math.BigDecimal;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        return (sum.multiply((percent.add(new BigDecimal(1.0)).pow(12)))).setScale(9, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
    }

}
