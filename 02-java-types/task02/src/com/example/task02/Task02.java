package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
            return ("int");
        if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
            return ("byte");
        if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
            return ("short");
        return "long";
    }

    public static void main(String[] args) {
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }
}
