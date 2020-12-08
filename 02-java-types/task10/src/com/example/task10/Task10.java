package com.example.task10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
         if ((!Float.isFinite(a) || !Float.isFinite(b)))
            return  Float.compare(a,b)==0;
        BigDecimal c = new BigDecimal(String.valueOf(a)).setScale(precision, RoundingMode.FLOOR);
        BigDecimal d =new BigDecimal(String.valueOf(b)).setScale(precision,RoundingMode.FLOOR);
        return c.floatValue()==d.floatValue();
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
