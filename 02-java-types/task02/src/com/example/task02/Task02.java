package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long l = Long.parseLong(input);

        if (l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE)
            return "byte";
        if (l >= Short.MIN_VALUE && l <= Short.MAX_VALUE)
            return "short";
        if (l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE)
            return "int";

        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
