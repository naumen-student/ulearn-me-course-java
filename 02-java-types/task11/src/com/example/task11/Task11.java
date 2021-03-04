package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        sum *= Math.pow(percent + 1.0, 12);
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
