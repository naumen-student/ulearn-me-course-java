package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
            return "byte";
        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
            return "short";
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
