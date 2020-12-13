package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber > 7 || weekDaysNumber < 1)
            throw  new IllegalArgumentException("Неверный день недели");
        String[] days = new String[]{"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        return days[weekDaysNumber - 1];
    }
}