package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String massage;
        switch (weekDaysNumber){
            case 1:
                massage = "понедельник";
                break;
            case 2:
                massage = "вторник";
                break;
            case 3:
                massage = "среда";
                break;
            case 4:
                massage = "четверг";
                break;
            case 5:
                massage = "пятница";
                break;
            case 6:
                massage = "суббота";
                break;
            case 7:
                massage = "воскресенье";
                break;
            default:
                massage = "такого дня недели не существует";
        }
        return massage;
    }
}