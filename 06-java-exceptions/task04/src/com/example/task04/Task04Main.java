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
            throw new MyException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        if (monthNumber == 12 || monthNumber < 3)
            return ("зима");
        if (monthNumber < 6)
            return ("весна");
        if (monthNumber < 9)
            return ("лето");
        return ("осень");
    }
}
