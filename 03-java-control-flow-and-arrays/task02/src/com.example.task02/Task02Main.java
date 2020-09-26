package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        if(1 <= monthNumber && monthNumber <=2 || monthNumber == 12)
            return "зима";
        if(3 <= monthNumber && monthNumber <=5)
            return "весна";
        if(6 <= monthNumber && monthNumber <=8)
            return "лето";
        if(9 <= monthNumber && monthNumber <=11)
            return "осень";
        return "";}
}