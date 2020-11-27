package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long fromString = Long.parseLong(input);
        if(Byte.MIN_VALUE <= fromString && Byte.MAX_VALUE>=fromString)
            return "byte";
        if(Short.MIN_VALUE<=fromString && Short.MAX_VALUE>=fromString)
            return "short";
        if(Integer.MIN_VALUE <=fromString && Integer.MAX_VALUE>=fromString)
            return "int";

        return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}
