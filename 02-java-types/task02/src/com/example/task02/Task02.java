package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long val = Long.parseLong(input);
        if (val <= Byte.MAX_VALUE && val >= Byte.MIN_VALUE) {
            return "byte";
        } else if (val <= Short.MAX_VALUE && val >= Short.MIN_VALUE) {
            return "short";
        } else if (val <= Integer.MAX_VALUE && val >= Integer.MIN_VALUE) {
            return "int";
        } else return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
