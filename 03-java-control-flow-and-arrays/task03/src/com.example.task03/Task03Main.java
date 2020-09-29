package com.example.task03;

import java.lang.reflect.Array;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber < 1 || weekDaysNumber > 7){
            return "такого дня недели не существует";
        }
        String[] weekdays = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        return weekdays[weekDaysNumber - 1];
    }
}