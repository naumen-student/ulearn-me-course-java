package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long a = Long.parseLong(input);
        if(a <= Byte.MAX_VALUE && a >= Byte.MIN_VALUE)
            return "byte";
        if(a <= Short.MAX_VALUE && a >= Short.MIN_VALUE)
            return "short";
        if(a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {

        String result = solution("1299939997248");
        System.out.println(result);

    }

}
