package com.example.task04;

class MyException extends IllegalArgumentException {

    public MyException(String message) {
        super(message);
    }
}

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {

        if (monthNumber < 1 || monthNumber > 12) throw new MyException(
                "monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        String[] seasons = new String[] {null, "зима", "зима", "весна", "весна", "весна",
                "лето", "лето", "лето", "осень", "осень", "осень", "зима"};
        return seasons[monthNumber];
    }

}