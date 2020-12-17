package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long integer = Long.valueOf(input);
        if (integer <= Byte.MAX_VALUE & integer >= Byte.MIN_VALUE)
            return "byte";
        else if (integer <= Short.MAX_VALUE & integer >= Short.MIN_VALUE)
            return "short";
        else if (integer <= Integer.MAX_VALUE & integer >= Integer.MIN_VALUE)
            return "int";
        else return "long";

    }

    public static void main(String[] args) {

    }

}
