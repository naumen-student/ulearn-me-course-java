package com.example.task02;

public class Task02Main {

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber <= 2)
            return "зима";
        if (monthNumber > 2 && monthNumber <= 5)
            return "весна";
        if (monthNumber > 5 && monthNumber <= 8)
            return "лето";
        return "осень";
    }
}