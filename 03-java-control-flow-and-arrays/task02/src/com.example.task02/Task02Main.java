package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if(monthNumber < 3) return "зима";
        if(monthNumber < 6) return "весна";
        if(monthNumber < 9) return "лето";
        if(monthNumber < 12) return "осень";
        return "зима";
    }
}