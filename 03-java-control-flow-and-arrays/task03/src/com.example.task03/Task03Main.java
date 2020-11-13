package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(6));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber >= 8) return "такого дня недели не существует";
        String[] list = {"такого дня недели не существует", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        return list[weekDaysNumber];
    }
}