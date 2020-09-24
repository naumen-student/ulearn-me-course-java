package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long number = Long.valueOf(input);
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
            return "byte";
        else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
            return "short";
        else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {

    }

}
