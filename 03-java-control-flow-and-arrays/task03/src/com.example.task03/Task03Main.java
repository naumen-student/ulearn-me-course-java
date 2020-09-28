package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        switch(weekDaysNumber){
            case(1):
                text = "понедельник";
            case(2):
                text = "вторник";
            case(3):
                text = "среда";
            case(4):
                text = "четверг";
            case(5):
                text = "пятница";
            case(6):
                text = "суббота";
            case(7):
                text = "воскресенье";
            default:
                return "такого дня недели не существует";

        }

    }
}