package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        String[] months = {"зима", "зима", "весна", "весна", "весна", "лето", "лето", "лето", "осень", "осень", "осень", "зима"};
        if (monthNumber < 1 || monthNumber > 12)
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        return months[monthNumber - 1];
    }

}