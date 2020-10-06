package com.example.task02;

public class Task02 {
    public static String solution(String input) {
        long checkNum = Long.parseLong(input);
        if(checkNum >= Byte.MIN_VALUE && checkNum <= Byte.MAX_VALUE) return "byte";
        else if (checkNum >= Short.MIN_VALUE && checkNum <= Short.MAX_VALUE) return "short";
        else if (checkNum >= Integer.MIN_VALUE && checkNum <= Integer.MAX_VALUE) return "int";
        else return "long";
    }

    public static void main(String[] args) {
    }

}
