package com.example.task02;

public class Task02Main {
    static String getSeason(int monthNumber) {
        if (1 <= monthNumber && monthNumber <= 2 || monthNumber == 12)
            return "Зима";
        if (3 <= monthNumber && monthNumber <= 5) {
            return "Весна";
        }
        if (6 <= monthNumber && monthNumber <= 8) {
            return "Лето";
        }
        return "Осень";
    }

    public static void main(String[] args) {

        System.out.println(getSeason(10));

    }
}