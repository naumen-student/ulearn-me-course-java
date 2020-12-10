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
        switch (monthNumber) {
            case ((monthNumber < 1 || monthNumber > 12):
                throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
                break;
            case (monthNumber < 3 || monthNumber == 12):
                return ("зима")
            break;
            case (monthNumber < 6 && monthNumber > 3):
                return ("весна")
            break;
            case (monthNumber < 9 && monthNumber > 6):
                text = "лето";
                break;
            case (monthNumber < 12 && monthNumber > 9):
                text = "осень";
                break;
        }
    }
}