package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (Byte.MIN_VALUE <= num && num <= Byte.MAX_VALUE)
            return "byte";
        if (Short.MIN_VALUE <= num && num <= Short.MAX_VALUE)
            return "byte";
        if (Integer.MIN_VALUE <= num && num <= Integer.MAX_VALUE)
            return "byte";
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("45");
        System.out.println(result);
    }

}
