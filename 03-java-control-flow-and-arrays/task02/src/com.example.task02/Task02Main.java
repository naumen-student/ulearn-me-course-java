package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.print(getSeason(7));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
            return "зима";
        if (monthNumber >= 3 && monthNumber <= 5)
            return "весна";
        if (monthNumber >= 6 && monthNumber <= 8)
            return "лето";
        return "осень";
    }
}