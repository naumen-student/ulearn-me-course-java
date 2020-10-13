package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        String output;
        switch (monthNumber) {
            default:
                output = "зима";
                break;
            case (3):
            case (4):
            case (5):
                output = "весна";
                break;
            case (6):
            case (7):
            case (8):
                output = "лето";
                break;
            case (9):
            case (10):
            case (11):
                output = "осень";
                break;
        }
        return output;
    }
}