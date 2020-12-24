package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {

        if (monthNumber <= 0 || monthNumber >= 13){
        throw new IllegalArgumentException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
        }

        if (monthNumber >= 3 && monthNumber <=5)
            return "весна";
        if (monthNumber >= 6 && monthNumber <=8)
            return "лето";
        if (monthNumber >= 9 && monthNumber <=11)
            return "осень";
        return "зима";
    }
}