package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        try {
            getSeason(-99999);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static String getSeason(int monthNumber) throws IllegalArgumentException {
        if (monthNumber > 12 || monthNumber <= 0) {
            throw new MyException(monthNumber);
        }
        if (monthNumber == 12 || monthNumber <= 2)
            return "зима";
        if (monthNumber <= 5)
            return "весна";
        if (monthNumber <= 8)
            return "лето";
        return "осень";
    }
}