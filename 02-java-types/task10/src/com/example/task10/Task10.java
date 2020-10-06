package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if (a == (int)a && b==(int)b)
        {
            return a == b;
        }
        if (Float.isNaN(a) && Float.isNaN(b))
            return true;
        if ((Float.isNaN(a) && b == 0.0f) || (Float.isNaN(b) && a == 0.0f))
            return false;
        float k = (float) Math.pow(10, precision);
        float x = (Math.round(a * k / 10) / k);
        float y = (Math.round(b * k / 10) / k);
        return x == y;

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
