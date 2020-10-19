package com.example.task02;

public class Task02Main {
    static String getSeason(int monthNumber) {
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