package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        double a = 0d;
        // Считаем проценты за год
        for (int i = 1; i <= 12; i++) {
            a += sum * percent;
        }
        return (float)a+sum;
    }

    public static void main(String[] args) {

        float sum = 222f; // 500 руб. на счете
        float percent = 0.00000179f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
