package com.example.task02;



public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);

        if (value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE)  {
            return "byte";
        }

        if (value <= Short.MAX_VALUE && value >= Short.MIN_VALUE) {
            return "short";
        }

        if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
            return "int";
        }

        return "long";
    }
}
