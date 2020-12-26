package com.example.task02;

public class Task02Main {

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber > 0 && monthNumber < 3)
            return "зима";
        if (monthNumber > 2 && monthNumber < 6)
            return "весна";
        if (monthNumber > 5 && monthNumber < 9)
            return "лето";
        return "осень";
    }
}