package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        final int monthCount = 12;
        final float powPercent = 1.0f + percent;
        return sum * (float) Math.pow(powPercent, monthCount);
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
