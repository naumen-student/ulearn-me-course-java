package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long inputValue = Long.parseLong(input);
        if (inputValue >= Byte.MIN_VALUE && inputValue <= Byte.MAX_VALUE)
            return "byte";
        if (inputValue >= Short.MIN_VALUE && inputValue <= Short.MAX_VALUE)
            return "short";
        if (inputValue >= Integer.MIN_VALUE && inputValue <= Integer.MAX_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {

    }

}
