package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber <= 2)
            return "зима";
        if (monthNumber <= 5)
            return "весна";
        if (monthNumber <= 8)
            return "лето";
        return "осень";
    }
}