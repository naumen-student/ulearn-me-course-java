package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (Byte.MAX_VALUE >= number && Byte.MIN_VALUE <= number)
            return "byte";
        else if (Short.MAX_VALUE >= number && Short.MIN_VALUE <= number)
            return "short";
        else if (Integer.MAX_VALUE >= number && Integer.MIN_VALUE <= number)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
