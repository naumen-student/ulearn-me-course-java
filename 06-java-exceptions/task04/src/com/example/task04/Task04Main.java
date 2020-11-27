package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

        //System.out.println(getSeason(-1));
        //...
        //...

    }

    static String getSeason(int monthNumber) {
        if ( monthNumber > 12 || monthNumber < 1) {
            throw new MyException("monthNumber " + monthNumber
                    + " is invalid, month number should be between 1..12");
        }

        return new String[] {"зима", "весна", "лето", "осень"}[monthNumber == 12? 0: monthNumber / 3];
    }
}