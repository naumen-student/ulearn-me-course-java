package com.example.task02;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public class Task02Main {

    public static void main(String[] args) {
        getSeason(-5);
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException(
                MessageFormat.format("monthNumber {0} is invalid, month number should be between 1..12", monthNumber)
            );

        String result = "";

        switch (Seasons.getSeason(monthNumber)) {
            case WINTER:
                result = "зима";
                break;
            case SPRING:
                result = "весна";
                break;
            case SUMMER:
                result = "лето";
                break;
            case AUTUMN:
                result = "осень";
                break;
        }

        return result;
    }

    private enum Seasons {
        WINTER(12, 1, 2),
        SPRING(3, 4, 5),
        SUMMER(6, 7, 8),
        AUTUMN(9, 10, 11),
        ;

        private final List<Integer> months;
        Seasons(Integer... months) {
            this.months = Arrays.asList(months);
        }

        public static Seasons getSeason(int monthNum) {
            for (Seasons season : Seasons.values()) {
                if (season.months.contains(monthNum))
                    return season;
            }

            throw new IllegalArgumentException("Month number should be in (1..12) range");
        }
    }
}