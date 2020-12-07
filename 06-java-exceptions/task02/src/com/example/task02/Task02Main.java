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
        String[] seasons  = {"зима", "весна", "лето", "осень"};
        if (monthNumber > 12 || monthNumber < 1)
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        else if (monthNumber >= 9 && monthNumber <= 11 )
            return seasons[3];
        else if (monthNumber >= 3 && monthNumber <= 5)
            return seasons[1];
        else if (monthNumber >= 6 && monthNumber <= 8)
            return seasons[2];
        else
            return seasons[0];
    }
}