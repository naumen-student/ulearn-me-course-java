package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] weekDays = new String[]{"понедельник", "вторник","среда","четверг","пятница","суббота","воскресенье"};
        return weekDaysNumber >= 1 && weekDaysNumber <= 7 ? weekDays[weekDaysNumber-1]
                : "такого дня недели не существует";
    }
}