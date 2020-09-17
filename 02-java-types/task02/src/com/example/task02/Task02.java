package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputConverToLong = Long.parseLong(input);
        if (inputConverToLong >= Byte.MIN_VALUE && inputConverToLong <= Byte.MAX_VALUE)
            return "byte";
        else if (inputConverToLong >= Short.MIN_VALUE && inputConverToLong <= Short.MAX_VALUE)
            return "short";
        else if (inputConverToLong >= Integer.MIN_VALUE && inputConverToLong <= Integer.MAX_VALUE)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
