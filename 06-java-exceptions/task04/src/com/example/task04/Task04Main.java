package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            throw new MyException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
        else
            return new String[]{"зима", "зима", "весна", "весна", "весна",
                    "лето", "лето", "лето", "осень", "осень", "осень", "зима"}[monthNumber - 1];
    }

}