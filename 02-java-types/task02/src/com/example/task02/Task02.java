package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long number = Long.parseLong(input);
        if(number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE)
            return "byte";
        if(number <= Short.MAX_VALUE && number >= Short.MIN_VALUE)
            return "short";
        if(number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {

        String result = solution("88888888");
        System.out.println(result);
    }

}
