package com.example.task02;

import java.util.Arrays;
import java.util.List;

public class Task02Main {

    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        List<String> seasons = Arrays.asList("зима", "весна", "лето", "осень");
        if (monthNumber < 0 || monthNumber > 12)
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        return seasons.get(monthNumber == 12 ? 0 : monthNumber / 3);
    }

}