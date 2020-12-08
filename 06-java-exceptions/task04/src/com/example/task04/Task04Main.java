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
        if (monthNumber > 12 || monthNumber < 1)
            throw new MyException(
                    String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        if (monthNumber / 3 == 1)
            return "весна";
        else if (monthNumber / 3 == 2)
            return "лето";
        else if (monthNumber / 3 == 3)
            return "осень";
        else
            return "зима";
    }

}