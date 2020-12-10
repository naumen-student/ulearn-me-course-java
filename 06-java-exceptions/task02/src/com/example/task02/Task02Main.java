package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        if (monthNumber < 3 || monthNumber == 12)
            return("зима");
        if (monthNumber < 6 && monthNumber > 3)
            return("весна");
        if (monthNumber < 9 && monthNumber > 6)
            return("лето");
        if (monthNumber < 12 && monthNumber > 9)
            return("осень");
    }
}
