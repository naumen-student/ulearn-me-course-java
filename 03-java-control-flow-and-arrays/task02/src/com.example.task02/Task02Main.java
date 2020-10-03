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
        if (monthNumber <= 2 || monthNumber == 12){
            return "зима";
        } else if (monthNumber <= 5){
            return "весна";
        } else if (monthNumber <= 8){
            return "лето";
        } else{
            return "осень";
        }
    }
}