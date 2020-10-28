package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        return monthNumber >= 3 && monthNumber <= 5 ? "весна"
                : monthNumber >= 6 && monthNumber <= 8 ? "лето"
                : monthNumber == 12 || monthNumber >= 1 && monthNumber <= 2 ? "зима"
                : monthNumber >= 9 && monthNumber <= 11 ? "осень"
                : "число выходит за рамки";
    }
}