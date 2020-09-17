package com.example.task02;

import static java.lang.Long.parseLong;

public class Task02 {

    public static String solution(String input) {

        long value = parseLong(input);
        if (isInBounds(Byte.MIN_VALUE, Byte.MAX_VALUE, value))
            return "byte";
        if (isInBounds(Short.MIN_VALUE, Short.MAX_VALUE, value))
            return "short";
        if (isInBounds(Integer.MIN_VALUE, Integer.MAX_VALUE, value))
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

    private static boolean isInBounds(long lowerBound, long upperBound, long value) {
        return value >= lowerBound && value <= upperBound;
    }

}
