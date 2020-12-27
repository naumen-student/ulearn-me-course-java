package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long input_number = Long.parseLong(input);
        if (input_number >= Byte.MIN_VALUE & input_number <= Byte.MAX_VALUE)
            return "byte";
        else if (input_number >= Short.MIN_VALUE & input_number <= Short.MAX_VALUE)
            return "short";
        else if (input_number >= Integer.MIN_VALUE & input_number <= Integer.MAX_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {

        System.out.println(solution("123"));

    }

}
