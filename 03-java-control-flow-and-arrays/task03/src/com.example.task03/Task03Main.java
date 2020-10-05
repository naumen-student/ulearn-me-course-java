package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.print(getNameOfWeekDays(3));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber < 1 || weekDaysNumber >7)
            return "такого дня недели не существует";
        String[] arr = {"понедельник","вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        return arr[weekDaysNumber-1];
    }
}