package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8)
            return "лето";
        else if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11)
            return "осень";
        else if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
            return "зима";
        else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5)
            return "весна";
        else
            throw new MyException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
    }
}

