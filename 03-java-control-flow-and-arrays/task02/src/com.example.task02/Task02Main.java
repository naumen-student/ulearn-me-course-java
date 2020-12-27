package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        return "";
        return new String[] {"зима", "весна", "лето", "осень"}[monthNumber % 12 / 3];
    }
}