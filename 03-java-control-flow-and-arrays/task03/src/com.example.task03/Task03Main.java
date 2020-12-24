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
        if (weekDaysNumber == 1) {
            return "понедельник";
        }

        if (weekDaysNumber == 2) {
            return "вторник";
        }

        if (weekDaysNumber == 3) {
            return "среда";
        }

        if (weekDaysNumber == 4) {
            return "четверг";
        }

        if (weekDaysNumber == 5) {
            return "пятница";
        }

        if (weekDaysNumber == 6) {
            return "суббота";
        }

        if (weekDaysNumber == 7) {
            return "воскресенье";
        }

        return "такого дня недели не существует";
    }
}