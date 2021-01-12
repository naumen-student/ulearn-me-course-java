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
        String[] month = {"зима", "зима", "весна", "весна", "весна", "лето", "лето",
                "лето", "осень", "осень", "осень", "зима"};
        return month[monthNumber - 1];
    }
}