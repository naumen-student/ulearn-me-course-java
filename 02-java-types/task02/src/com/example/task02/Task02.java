package com.example.task02;

public class Task02 {

    public static String solution(String input) {

       long fromString = Long.parseLong(input);
       if(fromString >= Byte.MIN_VALUE && fromString <= Byte.MAX_VALUE)
           return "byte";
        if(fromString >= Short.MIN_VALUE && fromString <= Short.MAX_VALUE)
            return "short";
       if(fromString >= Integer.MIN_VALUE && fromString <= Integer.MAX_VALUE)
           return "int";
       return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}
