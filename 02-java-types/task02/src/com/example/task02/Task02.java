package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long num = Long.parseLong(input);
        if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
            return "byte";
        if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
            return "short";
        if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
            return "int";

        return "long";
    }

    public static void main(String[] args) {

    }

}
