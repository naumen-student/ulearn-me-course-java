package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        int MaxShort = (int) Math.pow(2, 15);
        long MaxInt = (long) Math.pow(2, 31);
        if(number <= 127 && number >= -128) {
            return "byte";
        }
        else if(number <= MaxShort - 1 && number >= -1 * MaxShort){
            return "short";
        }
        else if (number <= MaxInt - 1 && number >= -1 * MaxInt){
            return "int";
        }
        return "long";

    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
