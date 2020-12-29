package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (1 <= monthNumber && monthNumber <= 2 || monthNumber == 12)
            return "зима";
        if (3 <= monthNumber && monthNumber <= 5)
            return "весна";
        if (6 <= monthNumber && monthNumber <= 8)
            return "лето";
        if (9 <= monthNumber && monthNumber <= 11)
            return "осень";
        else
            throw new IllegalArgumentException(String.format(
                    "monthNumber %d is invalid, month number should be between 1..12", monthNumber));
    }
}