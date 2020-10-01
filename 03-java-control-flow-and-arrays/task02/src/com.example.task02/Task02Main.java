package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {

        return new String[]{"зима", "зима", "весна", "весна", "весна", "лето",
                "лето", "лето", "осень", "осень", "осень", "зима"}[monthNumber - 1];
    }
}