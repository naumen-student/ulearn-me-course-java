package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] days=new String[]{
                "понедельник",
                "вторник",
                "среда",
                "четверг",
                "пятница",
                "суббота",
                "воскресенье",
        };
        return days[weekDaysNumber - 1]

    }
}