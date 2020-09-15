package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (Byte.MAX_VALUE >= num && Byte.MIN_VALUE <= num)
            return "byte";
        else if (Short.MAX_VALUE >= num && Short.MIN_VALUE <= num)
            return "short";
        else if (Integer.MAX_VALUE >= num && Integer.MIN_VALUE <= num)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
