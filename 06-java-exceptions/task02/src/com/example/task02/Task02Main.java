package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        String[] seasons = new String[]{"зима", "весна", "лето", "осень"};
        if (monthNumber > 12 || monthNumber < 0)
            throw new IllegalArgumentException(String.format(
                    "monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        else if (monthNumber == 12)
            return seasons[0];
        else
            return seasons[monthNumber / 3];
    }
}