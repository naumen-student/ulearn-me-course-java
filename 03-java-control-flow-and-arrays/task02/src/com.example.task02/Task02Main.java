package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        String[] seasons = new String[] {"зима", "весна", "лето", "осень"};
        int season = monthNumber % 12 / 3;
        return seasons[season];
    }
}