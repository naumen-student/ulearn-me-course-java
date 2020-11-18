package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12)
            monthNumber = 0;

        monthNumber = monthNumber / 3;

        switch (monthNumber) {
            case 0: return "зима";
            case 1: return "весна";
            case 2: return "лето";
            default: return "осень";
        }
    }
}