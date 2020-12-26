package com.example.task09;

public class Task09 {

    public static double solution() {
        // TODO Устраните ошибку вычисления выражения, не изменяя типы данных у переменных

        float a = 1.0f;
        float b = 3.0f;
        double x = (a / b - 1.0f / 3.0f) * 1.0e9;

        return x;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(solution());

    }

}
