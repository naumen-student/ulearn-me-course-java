package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long t = Long.parseLong(input);
        if (t >= Byte.MIN_VALUE && t <= Byte.MAX_VALUE) {
            return "byte";
        } else if (t >= Short.MIN_VALUE && t <= Short.MAX_VALUE) {
            return "short";
        } else if (t >= Integer.MIN_VALUE && t <= Integer.MAX_VALUE) {
            return "int";
        } else {
            return "long";
        }
    }

    public static void main(String[] args) {
    }

}
