package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12){
            throw new MyException(
                    String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
        }
        if (monthNumber <= 2 || monthNumber == 12){
            return "зима";
        } else if (monthNumber <= 5){
            return "весна";
        } else if (monthNumber <= 8){
            return "лето";
        } else{
            return "осень";
        }
    }

}