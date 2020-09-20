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
        String[] season = new String[] {"зима", "весна", "лето", "осень"};
        if (monthNumber <= 2 || monthNumber == 12) {
            return season[0];
        }
        else  return season[monthNumber / 3];
    }
}