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
        if (monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException("monthNumber " +
                    monthNumber + " is invalid, month number should be between 1..12");
        switch (monthNumber / 3){
            case 0:
            case 4:
                return "зима";
            case 1:
                return "весна";
            case 2:
                return "лето";
            case 3:
                return "осень";
        }

        return null;
    }
}