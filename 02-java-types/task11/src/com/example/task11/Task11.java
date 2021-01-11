package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        // Считаем проценты за год
        for (int i = 1; i <= 12; i++) {
            sum += sum * percent;
        }
        sum *= Math.pow(percent + 1.0, 12);
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        float sum = 500;
        float percent = 0.000_000_01f;
        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }
}
