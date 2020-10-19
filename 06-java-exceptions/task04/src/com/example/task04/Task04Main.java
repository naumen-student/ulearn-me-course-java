package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1) {
            String message = String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber);
            throw new MyException(message);
        }

        if (inBetween(monthNumber, 3, 5))
            return "весна";
        if (inBetween(monthNumber, 6, 8))
            return "лето";
        if (inBetween(monthNumber, 9, 11))
            return "осень";
        return "зима";
    }

    private static boolean inBetween(int value, int start, int end) {
        return value >= start && value <= end;
    }

}