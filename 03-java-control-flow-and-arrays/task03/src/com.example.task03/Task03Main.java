package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
 //       return "";
        String [] DAY_WEEK = {"","понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
        if(1 <= weekDaysNumber && weekDaysNumber <= 7)
            return DAY_WEEK[weekDaysNumber];
        return "такого дня недели не существует";

    }
}