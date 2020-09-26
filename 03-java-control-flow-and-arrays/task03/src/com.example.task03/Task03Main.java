package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        return weekDaysNumber == 1 ? "понедельник":
                weekDaysNumber == 2 ? "вторник":
                        weekDaysNumber == 3 ? "среда":
                                weekDaysNumber == 4 ? "четверг" :
                                        weekDaysNumber == 5 ? "пятница" :
                                                weekDaysNumber == 6 ? "суббота" :
                                                        weekDaysNumber == 7 ? "воскресенье" : "такого дня недели не существует";
    }
}