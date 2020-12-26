package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (number >= -128 && number <= 128)
            return "byte";
        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
            return "short";
        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }
}
