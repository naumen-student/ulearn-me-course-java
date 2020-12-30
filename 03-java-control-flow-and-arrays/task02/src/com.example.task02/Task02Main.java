package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {

            if (monthNumber>=1 && monthNumber <=3){
                return "зима";
            }
            else if (monthNumber>=4 && monthNumber <=6){
                return "весна";
            }
            else if (monthNumber>=7 && monthNumber <=9){
                return "лето";
            }
            return "осень";
    }
}