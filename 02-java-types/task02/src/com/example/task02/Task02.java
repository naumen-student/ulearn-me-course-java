package com.example.task02;
public class Task02 {

    public static String solution(String input){
        Long number = Long.parseLong(input);
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) return "byte";
        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) return "short";
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) return "int";
        if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) return "long";
        return "";
    }
}
