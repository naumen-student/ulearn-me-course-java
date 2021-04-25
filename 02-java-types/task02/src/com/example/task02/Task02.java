package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long x=Long.parseLong(input);

        if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
            return "byte";
        if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
            return "short";
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
