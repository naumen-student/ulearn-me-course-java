package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if(number <= 127 && number >= -128) {
            return "byte";
        }
        else if(number <= Math.pow(2 ,15) - 1 && number >= -1 * Math.pow(2, 15)){
            return "short";
        }
        else if (number <= Math.pow(2, 31) - 1 && number >= -1 * Math.pow(2, 31)){
            return "int";
        }
        return "long";

    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
