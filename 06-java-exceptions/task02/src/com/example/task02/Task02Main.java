package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException(
                    String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }

        if (monthNumber > 2 && monthNumber < 6)
            return "весна";
        else if (monthNumber > 5 && monthNumber < 9)
            return "лето";
        else if (monthNumber > 8 && monthNumber < 12)
            return "осень";
        else return "зима";
    }
}