package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] arrayWeekDays = new String[]
                {"понедельник", "вторник", "среда", "четверг",
                        "пятница", "суббота", "воскресенье"};
        if(1 <= weekDaysNumber && weekDaysNumber <= 7)
            return arrayWeekDays[weekDaysNumber - 1];
        return "такого дня недели не существует";
    }
}