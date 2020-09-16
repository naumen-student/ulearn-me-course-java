package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputNumber = Long.parseLong(input);

        if (checkBounds(inputNumber, Byte.MIN_VALUE, Byte.MAX_VALUE))
            return "byte";
        if (checkBounds(inputNumber, Short.MIN_VALUE, Short.MAX_VALUE))
            return "short";
        if (checkBounds(inputNumber, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return "int";
        if (checkBounds(inputNumber, Long.MIN_VALUE, Long.MAX_VALUE))
            return "long";

        return null;
    }

    private static boolean checkBounds(long number, long minValue, long maxValue) {
        return (number >= minValue && number <= maxValue);
    }

    public static void main(String[] args) {
        System.out.println(solution("1"));
        System.out.println(solution("12345"));
        System.out.println(solution("12345678"));
        System.out.println(solution("123456789000"));
    }
}
