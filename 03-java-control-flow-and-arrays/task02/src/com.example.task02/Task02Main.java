package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        switch (weekDaysNumber) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "такого дня недели не существует";
        }
    }
}