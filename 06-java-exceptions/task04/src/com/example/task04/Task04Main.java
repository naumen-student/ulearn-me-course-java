package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        if (monthNumber >= 13 || monthNumber <=0){
            throw new MyException("monthNumber " + monthNumber +" is invalid, month number should be between 1..12");
        }
        monthNumber %= 12;
        monthNumber /= 3;
        String season;
        switch (monthNumber) {
            case 0:
                season = "зима";
                break;
            case 1:
                season = "весна";
                break;
            case 2:
                season = "лето";
                break;
            default:
                season = "осень";
                break;
        }
        return season;
    }

}