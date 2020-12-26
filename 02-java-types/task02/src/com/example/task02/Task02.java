package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long line = Long.parseLong(input);
        if (Byte.MIN_VALUE <= line && line <= Byte.MAX_VALUE)
            return "byte";
        if (Integer.MIN_VALUE <= line && line <= Integer.MAX_VALUE)
            return "int";
        if (Short.MIN_VALUE <= line && line <= Short.MAX_VALUE)
            return "short";
        return "long";
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
