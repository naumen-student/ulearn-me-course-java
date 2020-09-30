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

        int mNumberModify = monthNumber % 12; //Декабрь теперь нулевой месяц

        if (mNumberModify >= 0 && mNumberModify <= 2) {
            return "зима";
        }
        else if (mNumberModify >= 3 && mNumberModify <= 5) {
            return "весна";
        }
        else if (mNumberModify >= 6 && mNumberModify <= 8) {
            return "лето";
        }
        else {
            return "осень";
        }
    }
}