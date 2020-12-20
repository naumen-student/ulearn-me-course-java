package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long l = Long.valueOf(input);
        if (l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE)
            return "byte";
        if (l <= Short.MAX_VALUE && l >= Short.MIN_VALUE)
            return "short";
        if (l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE)
            return "int";
        if (l <= Long.MAX_VALUE && l >= Long.MIN_VALUE)
            return "long";
        return "";
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
