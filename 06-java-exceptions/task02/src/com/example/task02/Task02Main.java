package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        if (monthNumber == 12 || monthNumber < 3)
            return ("зима");
        if (monthNumber < 6)
            return ("весна");
        if (monthNumber < 9)
            return ("лето");
        return "осень";
    }
}