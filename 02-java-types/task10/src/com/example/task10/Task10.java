package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        if (Float.isNaN(a) && Float.isNaN(b)) return true;
        else if ((Float.isInfinite(a) && Float.isInfinite(b)) && (a * b > 0)) return true;
        else return (Math.abs(a - b) < Math.pow(10, precision * -(1)));
    }

    public static void main(String[] args) {
        boolean result = compare(100.001f, 100.009f, 4);
        System.out.println(result);

    }
}
