package com.example.task03;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber < 1 || weekDaysNumber > 7)
            return "такого дня недели не существует";
        DayOfWeek month = DayOfWeek.of(weekDaysNumber);
        Locale loc = Locale.forLanguageTag("ru");

        return month.getDisplayName(TextStyle.FULL_STANDALONE, loc);
    }
}