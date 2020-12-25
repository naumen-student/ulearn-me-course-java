package com.example.task04;

import java.text.MessageFormat;

public class Task04Main {

    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        String[] seasons = new String[] {"зима", "весна", "лето", "осень"};
        if(monthNumber < 1 || monthNumber > 12) {
            throw new MyException(MessageFormat.format("monthNumber {0} is invalid, month number should be between 1..12", monthNumber));
        }
        return seasons[monthNumber % 12 / 3];
    }

}
