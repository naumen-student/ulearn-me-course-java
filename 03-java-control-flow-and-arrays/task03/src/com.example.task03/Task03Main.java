package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {

        String[] dayOfWeeks = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        weekDaysNumber--;
        if (weekDaysNumber <= 6 && weekDaysNumber >= 0)
            return dayOfWeeks[weekDaysNumber];
        return "такого дня недели не существует";
    }
}