package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int i) {
        if (i == 1 || i == 2 || i == 12)
            return "зима";
        else if (i >= 3 && i <= 5)
            return "весна";
        else if (i >= 6 && i <= 8)
            return "лето";
        else if (i >= 9 && i <= 11)
            return "осень";
        else
            throw new IllegalArgumentException("monthNumber " + i + " is invalid, month number should be between 1..12");
    }
}
