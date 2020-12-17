package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if (Float.isNaN(a) && Float.isNaN(b))
            return true;
        if ((Float.isNaN(a) && !Float.isNaN(b)) || (Float.isNaN(b) && !Float.isNaN(a)))
            return false;
        float round = 10;
        if(precision != 0)
            round = (float) Math.pow(10, precision);
        float x = (Math.round(a * round / 10) );
        float y = (Math.round(b * round / 10) );
        int comp = Float.compare(x, y);
        return comp == 0;

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
