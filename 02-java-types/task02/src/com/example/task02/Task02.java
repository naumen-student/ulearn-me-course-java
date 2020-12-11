package com.example.task02;
public class Task02 {

    public static String solution(String input) {

        long longInput = Long.parseLong(input);
        if (longInput >= Byte.MIN_VALUE && longInput <= Byte.MAX_VALUE)
            return "byte";
        if (longInput >= Short.MIN_VALUE && longInput <= Short.MAX_VALUE)
            return "short";
        if (longInput >= Integer.MIN_VALUE && longInput <= Integer.MAX_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {

    }

}

