package com.example.task03;

import org.w3c.dom.ranges.RangeException;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) throws RangeException {
        String[] str = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        try {
            return str[weekDaysNumber - 1];
        } catch (RangeException e) {
            return "такого дня недели не существует";
        }
    }
}