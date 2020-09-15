package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) return "byte";
        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) return "short";
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) return "int";
        return "long";
    }

    public static void main(String[] args) {
        String[] numbers = new String[]{"5", "-35000", "512", "2500000000"};
        for (String number : numbers) {
            String result = solution(number);
            System.out.println(result);
        }
    }

}