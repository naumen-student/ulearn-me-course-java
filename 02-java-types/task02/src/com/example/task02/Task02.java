package com.example.task02;

public class Task02 {

    static String solution(String input) {

        if (-128 <= Long.parseLong(input) && Long.parseLong(input) <= 127)
            return "byte";
        if (-32768 <= Long.parseLong(input) && Long.parseLong(input) <= 32767)
            return "short";
        if (-2147483648 <= Long.parseLong(input) && Long.parseLong(input) <= 2147483647)
            return "int";
        if (Long.MIN_VALUE <= Long.parseLong(input) && Long.parseLong(input) <= Long.MAX_VALUE)
            return "long";
        else return "-";

    }

    public static void main(String[] args) {

        String result = solution("12");
        System.out.println(result);

    }
}
