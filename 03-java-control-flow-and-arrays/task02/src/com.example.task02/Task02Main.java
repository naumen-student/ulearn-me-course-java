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
        if (monthNumber >= 3 && monthNumber <= 5)
            return "весна";
        else if(monthNumber >= 6 && monthNumber <= 8)
            return "лето";
        else if(monthNumber >= 9 && monthNumber <= 11)
            return "осень";
        else
            return "зима";

    }
}
