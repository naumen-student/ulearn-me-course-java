package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        return monthNumber == 1 || monthNumber == 2 || monthNumber == 12 ? "зима" :
                monthNumber == 3 || monthNumber == 4 || monthNumber == 5 ? "весна" :
                monthNumber == 6 || monthNumber == 7 || monthNumber == 8 ? "лето" : "осень";
    }
}