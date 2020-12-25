package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        if (weekDaysNumber < 1 && weekDaysNumber > 7) {
            return "такого дня недели не существует";
        }
        else if (weekDaysNumber == 1) {
            return "понедельник";
        }
        else if (weekDaysNumber == 2) {
            return "вторник";
        }
        else if (weekDaysNumber == 3) {
            return "среда";
        }
        else if (weekDaysNumber == 4) {
            return "четверг";
        }
        else if (weekDaysNumber == 5) {
            return "пятница";
        }
        else if (weekDaysNumber == 6) {
            return "суббота";
        }
        else return "воскресенье";
    }
}