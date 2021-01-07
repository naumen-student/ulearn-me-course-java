package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int number) {
        if (number > 8 && number < 11)
            return "осень";
        else if (number > 5 && number < 9)
            return "лето";
        else if (number > 2 && number < 6)
            return "весна";
        else
            return "зима";
    }
}