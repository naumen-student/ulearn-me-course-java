package com.example.task10;


import static java.lang.Float.NaN;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        double scale = Math.pow(10, precision);
        if ((a != a && b !=b) || (a == b))
            return  true;
        //if (Math.round(a * scale * 10) % 10 > 4)
           // a = (float) ((Math.round(a * scale * 10) - 5) / (10 * scale));
        //if (Math.round(b * scale * 10) % 10 > 4)
           //b = (float) ((Math.round(b * scale * 10) - 5) / (10 * scale));

        //return (Math.round(a * scale) / scale == Math.round(scale * b) / scale);
        return Math.abs(a - b) < Math.pow(0.1,precision);

    }

    public static void main(String[] args) {
        float a = 0.0f;
        float b = NaN;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(a, b, 10);
        System.out.println(result);
        System.out.println(sum);

    }

}
