package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        int a = monthNumber;
        if (a > 0 && a < 13) {
            if (a == 1 || a == 2 || a == 12) return "зима";
            else if (a == 3 || a == 4 || a == 5) return "весна";
            else if (a == 6 || a == 7 || a == 8) return "лето";
            else return "осень";
        }
        else throw new IllegalArgumentException("monthNumber " +a+ " is invalid, month number should be between 1..12");
    }
}