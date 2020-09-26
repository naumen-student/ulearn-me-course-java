package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        String[] season = new String[] {"зима", "весна", "лето", "осень"};
        if (monthNumber <= 2 || monthNumber == 12) {
            return season[0];
        }
        else  return season[monthNumber / 3];
    }
}