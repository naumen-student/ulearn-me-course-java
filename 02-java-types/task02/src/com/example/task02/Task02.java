package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        String result = "long";

        if (value >= -128 && value <= 127)
            result = "byte";
        else if (value >= -32768 && value <= 32767)
            result = "short";
        else if (value >= -2147483648 && value <= 2147483647)
            result = "int";

        return result;
    }

    public static void main(String[] args) {
    }

}
