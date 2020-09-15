package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        float fault = 0;
        for (int i = 1; i <= 12; i++) {
            float accumulation = sum * percent - fault;
            float t = sum + accumulation;
            fault = (t - sum) - accumulation;
            sum = t;
        }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
