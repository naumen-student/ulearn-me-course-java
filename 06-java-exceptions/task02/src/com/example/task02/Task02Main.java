package com.example.task02;

public class Task02Main {
    private static final String[] seasons = {
            "зима",
            "зима",
            "весна",
            "весна",
            "весна",
            "лето",
            "лето",
            "лето",
            "осень",
            "осень",
            "осень",
            "зима",
    };

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException(String.format(
                    "monthNumber %s is invalid, month number should be between 1..12",
                    monthNumber));
        }
        return seasons[monthNumber - 1];
    }
}