package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1)
            throw new IllegalArgumentException(
                    String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber)
            );

        if (inBetween(monthNumber, 3, 5))
            return "весна";
        if (inBetween(monthNumber, 6, 8))
            return "лето";
        if (inBetween(monthNumber, 9, 11))
            return "осень";
        return "зима";
    }

    private static boolean inBetween(int value, int start, int end) {
        return value >= start && value <= end;
    }
}