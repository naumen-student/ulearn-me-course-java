package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        if (isByte(input))
            return "byte";
        else if(isShort(input))
            return "short";
        else if (isInt(input))
            return "int";
        return "long";
    }

    public static boolean isShort(String input){
        return Long.parseLong(input) <= Short.MAX_VALUE && Long.parseLong(input) >= Short.MIN_VALUE;
    }

    public static boolean isByte(String input){
        return Long.parseLong(input) <= Byte.MAX_VALUE && Long.parseLong(input) >= Byte.MIN_VALUE;
    }
    
    public static boolean isInt(String input){
        return Long.parseLong(input) <= Integer.MAX_VALUE && Long.parseLong(input) >= Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        String result = solution("-127");
        System.out.println(result);
    }

}
