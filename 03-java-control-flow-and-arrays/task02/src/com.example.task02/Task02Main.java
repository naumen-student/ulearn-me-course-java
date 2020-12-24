package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 3 || monthNumber == 12)
            return "зима";
        else if (monthNumber < 6)
            return "весна";
        else if (monthNumber < 9)
            return "лето";
        else return "осень";
    }
}
