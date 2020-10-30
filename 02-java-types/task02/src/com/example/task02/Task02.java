package com.example.task02;

import com.sun.tools.javac.util.Convert;

public class Task02 {

    public static String solution(String input) {
        long l = Long.parseLong(input);
        if(l <= Byte.MAX_VALUE & l >= Byte.MIN_VALUE)
            return "byte";
        else if(l <= Short.MAX_VALUE & l >= Short.MIN_VALUE)
            return "short";
        else if(l <= Integer.MAX_VALUE & l >= Integer.MIN_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {
        System.out.println(solution("123"));
    }

}
