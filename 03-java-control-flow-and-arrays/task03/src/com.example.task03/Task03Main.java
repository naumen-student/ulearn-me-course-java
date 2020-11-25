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
        String weekDaysName;
        switch (weekDaysNumber){
            case 1:
                weekDaysName = "понедельник";
                break;
            case 2:
                weekDaysName = "вторник";
                break;
            case 3:
                weekDaysName = "среда";
                break;
            case 4:
                weekDaysName = "четверг";
                break;
            case 5:
                weekDaysName = "пятница";
                break;
            case 6:
                weekDaysName = "суббота";
                break;
            case 7:
                weekDaysName = "воскресенье";
                break;
            default:
                weekDaysName = "такого дня недели не существует";
                break;
        }
        return weekDaysName;
    }
}