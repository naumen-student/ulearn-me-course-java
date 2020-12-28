package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        if (Long.parseLong(input) == (byte)Long.parseLong(input))
            return "byte";
        if (Long.parseLong(input) == (short)Long.parseLong(input))
            return "short";
        if (Long.parseLong(input) == (int)Long.parseLong(input))
            return "int";
        return "long";
    }

    public static void main(String[] args) {
    }

}
