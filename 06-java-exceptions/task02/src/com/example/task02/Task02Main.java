package com.example.task02;

import java.text.MessageFormat;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        String[] seasons = new String[] {"зима", "весна", "лето", "осень"};
        if(monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException(MessageFormat.format("monthNumber {0} is invalid, month number should be between 1..12", monthNumber));
        }
        return seasons[monthNumber % 12 / 3];
    }
}