package com.example.task03;

import java.util.HashMap;
import java.util.Map;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String response = "такого дня недели не существует";
        Map<Integer, String> days = new HashMap<Integer, String>(){{
            put( 1 , "понедельник"); put( 2 , "вторник");
            put( 3 , "среда");       put( 4 , "четверг");
            put( 5 , "пятница");     put( 6 , "суббота");
            put( 7 , "воскресенье");
        }};
        if (days.containsKey(weekDaysNumber))
            response = days.get(weekDaysNumber);
        return response;
    }
}