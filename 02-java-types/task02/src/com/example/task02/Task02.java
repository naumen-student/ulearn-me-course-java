package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long c = Long.parseLong(input);
        if (c >= -128 && c <= 127) {
            return "byte";
        }
        if (c >= -32768 && c <= 32767) {
            return "short";
        }
        if (c >= -2147483648 && c <= 2147483647) {
            return "int";
        }
        if (c <= -2147483648 || c > 2147483647) {
            return "long";
        }
        return "";
    }
}
