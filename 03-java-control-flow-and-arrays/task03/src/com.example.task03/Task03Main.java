package com.example.task03;

    import java.util.HashMap;
    import java.util.Map;

    public class Task03Main {
        private static Map<Integer, String> numbersOfDays = new HashMap<Integer, String>();

    static String getNameOfWeekDays(int weekDaysNumber) {
        numbersOfDays.put(1, "понедельник");
        numbersOfDays.put(2, "вторник");
        numbersOfDays.put(3, "среда");
        numbersOfDays.put(4, "четверг");
        numbersOfDays.put(5, "пятница");
        numbersOfDays.put(6, "суббота");
        numbersOfDays.put(7, "воскресенье");
        if (numbersOfDays.containsKey(weekDaysNumber))
            return numbersOfDays.get(weekDaysNumber);
        return "такого дня недели не существует";
    }
}