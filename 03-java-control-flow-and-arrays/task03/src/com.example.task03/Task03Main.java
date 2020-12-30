package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(1));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] array = new String[]{"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        return (weekDaysNumber > 7 || weekDaysNumber < 1) ? "такого дня недели не существует" : array[weekDaysNumber - 1];
    }
}