package com.example.task03;

public class Task03Main {
    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] week = new String[] { "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье" };
        return week[weekDaysNumber - 1];
    }
}