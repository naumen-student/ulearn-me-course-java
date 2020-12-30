package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(8));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String [] week = new String[] {"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
        if (weekDaysNumber < 1 || weekDaysNumber > 7)
            return "такого дня недели не существует";
        else return week[weekDaysNumber - 1];
    }
}