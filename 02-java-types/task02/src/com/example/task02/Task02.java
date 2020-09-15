package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        double bites = value > 0 ? Math.log(value) / Math.log(2) : Math.log(Math.abs(value) - 1) / Math.log(2);
        if (value == 0 || bites < 7)
            return "byte";
        else if (bites < 15)
            return "short";
        else if (bites < 31)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
