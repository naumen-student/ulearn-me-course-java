package com.example.task04;

public class Task04Main {
    private static final String[] seasons = {"зима", "весна", "лето", "осень"};

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            throw new MyException(String.format(
                    "monthNumber %d is invalid, month number should be between 1..12",
                    monthNumber));
        else if (monthNumber == 12)
            return seasons[0];
        else return seasons[monthNumber / 3];
    }
}