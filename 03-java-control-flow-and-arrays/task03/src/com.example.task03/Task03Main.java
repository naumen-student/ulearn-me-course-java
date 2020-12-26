package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber < 1 || weekDaysNumber > 7)
            return "такого дня недели не существует";
        return new String[] {
                "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"
        }[weekDaysNumber - 1];
    }
}