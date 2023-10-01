package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputValue = Long.parseLong(input);
        if (inputValue > Integer.MAX_VALUE || inputValue < Integer.MIN_VALUE)
            return "long";
        if (inputValue > Short.MAX_VALUE || inputValue < Short.MIN_VALUE)
            return "int";
        if (inputValue > Byte.MAX_VALUE || inputValue < Byte.MIN_VALUE)
            return "short";
        return "byte";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }
}
