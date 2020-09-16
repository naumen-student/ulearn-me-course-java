package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        double infelicity = 0;
        if (precision != 0) {
            infelicity = Math.pow(0.1, precision);
        }
        if ((a > Long.MAX_VALUE && b > Long.MAX_VALUE)||Double.isNaN(a)&& Double.isNaN(b) ||
                (a < Long.MIN_VALUE && b < Long.MIN_VALUE))
            return true;
        return Math.abs(a - b) <= infelicity;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(1f, 2, 0);
        System.out.println(result);

    }

}
