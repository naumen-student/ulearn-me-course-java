package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        return (float) (sum * Math.pow(percent + 1d, 12));
    }

    public static void main(String[] args) {

        float sum = 500;
        float percent = 0.00000001f;

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
