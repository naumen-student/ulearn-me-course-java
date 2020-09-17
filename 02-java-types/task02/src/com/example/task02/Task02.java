package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long parseInput = Long.parseLong(input);
        if (parseInput >= -128 && parseInput <= 127)
            return "byte";
        else if (parseInput >= -32768 && parseInput <= 32767)
            return "short";
        else if (parseInput >= -2147483648 && parseInput <= 2147483647)
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
