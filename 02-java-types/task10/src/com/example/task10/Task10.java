package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        return IsEqualsInfinity(a, b)
                || IsBothNaN(a, b)
                || Math.abs(a - b) < Math.pow(0.1, precision);

    }

    private static boolean IsEqualsInfinity(float a, float b) {
        return Float.isInfinite(a) && Float.isInfinite(b) && a == b;
    }

    private static boolean IsBothNaN(float a, float b) {
        return Float.isNaN(a) && Float.isNaN(b);
    }

}
