package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long longInput = Long.parseLong(input);
        if (longInput <= Byte.MAX_VALUE && longInput >= Byte.MIN_VALUE)
            return "byte";
        if (longInput <= Short.MAX_VALUE && longInput >= Short.MIN_VALUE)
            return "short";
        if (longInput <= Integer.MAX_VALUE && longInput >= Integer.MIN_VALUE)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);

    }

}
