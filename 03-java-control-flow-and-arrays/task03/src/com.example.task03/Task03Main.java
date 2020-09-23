package com.example.task03;

import java.util.Dictionary;
import java.util.HashMap;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        HashMap<Integer,String> dict = new HashMap<Integer,String>()
        {{
            put(1,"понедельник");
            put(2,"вторник");
            put(3,"среда");
            put(4,"четверг");
            put(5,"пятница");
            put(6,"суббота");
            put(7,"воскресенье");
        }};
        if (dict.containsKey(weekDaysNumber))
            return dict.get(weekDaysNumber);
        return "такого дня недели не существует";
    }
}