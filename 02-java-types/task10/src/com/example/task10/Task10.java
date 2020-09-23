package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        return Math.abs(a - b) < Math.pow(10,-precision) || Float.isNaN(a) && Float.isNaN(b)
                || Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a+b);

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
