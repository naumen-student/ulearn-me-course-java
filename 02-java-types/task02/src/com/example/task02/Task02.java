package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (Byte.MIN_VALUE <= number && number <= Byte.MAX_VALUE)
            return "byte";
        if (Short.MIN_VALUE <= number && number <= Short.MAX_VALUE)
            return "short";
        if (Integer.MIN_VALUE <= number && number <= Integer.MAX_VALUE)
            return "int";
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
