package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1 )
            throw new IllegalArgumentException("monthNumber " + monthNumber
                    + " is invalid, month number should be between 1..12");
        return new String[] {"зима", "весна", "лето", "осень"}[monthNumber == 12? 0: monthNumber / 3];
    }
}