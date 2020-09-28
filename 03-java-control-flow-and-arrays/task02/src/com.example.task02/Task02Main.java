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
        if (inBetween(monthNumber, 3, 5))
            return "весна";
        if (inBetween(monthNumber, 6, 8))
            return "лето";
        if (inBetween(monthNumber, 9, 11))
            return "весна";
        return "зима";
    }

    private static boolean inBetween(int value, int start, int end){
        return value >= start && value <= end;
    }
}