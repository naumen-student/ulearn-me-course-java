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
        return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return new String[] {"зима", "весна", "лето", "осень"}[monthNumber % 12 / 3];
    }
}