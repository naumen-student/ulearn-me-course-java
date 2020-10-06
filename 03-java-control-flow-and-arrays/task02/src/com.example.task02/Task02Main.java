package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber <= 2) {
            return "зима";
        }
        if (monthNumber <= 5){
            return "весна";
        }
        if (monthNumber <= 8){
            return "лето";
        }
        if (monthNumber <= 11){
            return "осень";
        }
        return null;
    }
}