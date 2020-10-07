package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        float realInput = Float.parseFloat(input);
        if(realInput >= -128 && realInput <= 127)
            return "byte";
        if(realInput >= -32768 && realInput <= 32767)
            return "short";
        if(realInput >= -2147483648 && realInput <= 2147483647)
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        System.out.print(solution("50000000000000000"));
    }
}
