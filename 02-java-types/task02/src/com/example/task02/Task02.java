package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (Byte.MIN_VALUE <= num && num <= Byte.MAX_VALUE)
            return "byte";
        if (Short.MIN_VALUE <= num && num <= Short.MAX_VALUE)
            return "short";
        if (Integer.MIN_VALUE <= num && num <= Integer.MAX_VALUE)
            return "int";
        if (Long.MIN_VALUE <= num && num <= Long.MAX_VALUE)
            return "long";
        else return "Not a number";
    }

    public static void main(String[] args) {

    }

}
