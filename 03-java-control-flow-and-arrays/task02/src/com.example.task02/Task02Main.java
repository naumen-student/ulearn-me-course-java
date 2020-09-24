package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        return monthNumber < 3 || monthNumber == 12 ? "зима" : monthNumber < 6
                ? "весна" : monthNumber < 9 ? "лето" : "осень";
    }
}