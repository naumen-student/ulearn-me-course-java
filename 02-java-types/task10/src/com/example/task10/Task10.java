package com.example.task10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.channels.FileLock;
import java.text.DecimalFormat;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if(Float.isNaN(a) && Float.isNaN(b))
            return true;
        else if((Float.isNaN(a) && !Float.isNaN(b)) || (!Float.isNaN(a) && Float.isNaN(b)))
            return false;
        if(precision != 0) {
            long newA = (long) (a * (long) Math.pow(10, precision));
            long newB = (long) (b * (long) Math.pow(10, precision));
            return newA == newB;
        }
        else return a == b;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        System.out.println(compare(0.0f, 0.0f / 0.0f, 10));

    }

}
