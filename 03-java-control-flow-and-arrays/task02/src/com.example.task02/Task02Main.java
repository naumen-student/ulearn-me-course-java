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