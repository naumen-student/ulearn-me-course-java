package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long pLong = Long.parseLong(input);
        if (pLong >= Byte.MIN_VALUE && pLong <= Byte.MAX_VALUE)
            return "byte";
        if (pLong >= Short.MIN_VALUE && pLong <= Short.MAX_VALUE)
            return "short";
        if (pLong >= Integer.MIN_VALUE && pLong <= Integer.MAX_VALUE)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        String result = solution("" + Integer.MIN_VALUE);
        System.out.println(result);
    }
}
