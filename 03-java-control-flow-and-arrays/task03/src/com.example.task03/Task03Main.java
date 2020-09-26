package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] days = new String[] {"такого дня недели не существует", "понедельник",
                "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (weekDaysNumber < 1 || weekDaysNumber > 7) {
            return days[0];
        }
        else return days[weekDaysNumber];
    }
}