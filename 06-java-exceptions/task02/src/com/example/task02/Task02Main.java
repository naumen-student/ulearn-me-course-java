package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(3));
        try {
            getSeason(-99999);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    static String getSeason(int monthNumber) throws IllegalArgumentException {
        if(monthNumber > 12 || monthNumber <= 0) {
            throw new IllegalArgumentException(
                    String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
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