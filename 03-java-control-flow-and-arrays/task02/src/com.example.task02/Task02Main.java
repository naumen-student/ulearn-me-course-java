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
        int a = monthNumber/4;
        if (monthNumber == 12 || monthNumber > 0 && monthNumber < 3)
            return "зима";
        else if (monthNumber >= 3 && monthNumber <= 5)
            return "весна";
        else if (monthNumber >= 6 && monthNumber <= 8)
            return "лето";
        else
            return "осень";
         //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}