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
        if (monthNumber < 1 || monthNumber > 12)
            throw new MyException(String.format(
                    "monthNumber %s is invalid, month number should be between 1..12",
                    monthNumber));

        String yearTime;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                yearTime = "зима";
                break;
            case 3:
            case 4:
            case 5:
                yearTime = "весна";
                break;
            case 6:
            case 7:
            case 8:
                yearTime = "лето";
                break;
            case 9:
            case 10:
            case 11:
                yearTime = "осень";
                break;
            default:
                yearTime = "Неверный номер";
        }
        return yearTime;
    }

}