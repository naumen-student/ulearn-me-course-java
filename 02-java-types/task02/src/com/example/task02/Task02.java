package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        return Math.abs(Long.parseLong(input)) - 1 > (long)Integer.MAX_VALUE ? "long" :
                Math.abs(Integer.parseInt(input)) - 1 > (int)Short.MAX_VALUE ? "int" :
                        Math.abs(Short.parseShort(input)) - 1 > (short)Byte.MAX_VALUE ? "short" : "byte";
    }

    public static void main(String[] args) {
    }

}
