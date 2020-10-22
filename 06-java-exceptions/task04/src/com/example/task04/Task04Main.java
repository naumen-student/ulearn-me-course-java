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
        if (monthNumber<=0 || monthNumber>12)
            throw  new MyException
                    ("monthNumber "+monthNumber+" is invalid, month number should be between 1..12");
        if ( monthNumber<=2 || monthNumber==12)
            return "зима";
        if (monthNumber<=5)
            return "весна";
        if (monthNumber<=8)
            return "лето";
        return "осень";
    }

}