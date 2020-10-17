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
        switch (monthNumber / 3){
            case 1:
                return "весна";
            case 2:
                return "лето";
            case 3:
                return "осень";
            default:
                return "зима";
        }
    }
}