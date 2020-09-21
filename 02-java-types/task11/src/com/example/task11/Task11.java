package com.example.task11;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Task11 {

    public static float benefit(float sum, float percent) {
        if (percent<0.005)
            return  sum*(percent)*12+sum;
        for (int i = 1; i <= 12; i++)
            sum += new BigDecimal(percent).
                    multiply(new BigDecimal(sum)).
                    round(new MathContext(6,RoundingMode.DOWN)).
                    floatValue();
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
