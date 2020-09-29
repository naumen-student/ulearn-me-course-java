package com.example.task02;

import java.security.InvalidParameterException;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber<=2 || monthNumber==12)
            return "зима";
        if (monthNumber<=5)
            return "весна";
        if (monthNumber<=8)
            return "лето";
        if (monthNumber<=11)
            return "осень";
        throw  new InvalidParameterException("month number is not valid");
    }
}