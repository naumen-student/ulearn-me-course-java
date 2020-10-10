package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        if (isByt(input))
            return "byte";
        else if(isShor(input))
            return "short";
        else if (isIn(input))
            return "int";
        return "long";
    }

    // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
    public static boolean isShor(String input){
        return Long.parseLong(input) <= Short.MAX_VALUE && Long.parseLong(input) >= Short.MIN_VALUE;
    }

    public static boolean isByt(String input){
        return Long.parseLong(input) <= Byte.MAX_VALUE && Long.parseLong(input) >= Byte.MIN_VALUE;
    }

    public static boolean isIn(String input){
        return Long.parseLong(input) <= Integer.MAX_VALUE && Long.parseLong(input) >= Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

    }

}