package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        if(value <= 128 && value >= -128)
            return "byte";
        if(value <= Math.pow(2, 15) && value >= -Math.pow(2, 15))
            return "short";
        if(value <= Math.pow(2, 31) && value >= -Math.pow(2, 31))
            return "int";
        if(value <= Math.pow(2, 63) && value >= -Math.pow(2, 63))
            return "long";
        return "некорректный ввод";
    }

    public static void main(String[] args) {
    }

}
