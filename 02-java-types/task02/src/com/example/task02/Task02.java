package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        String s;
        if (tryParseByte(input))
            s = "byte";
        else if (tryParseShort(input))
            s = "short";
        else if (tryParseInt(input))
            s = "int";
        else
            s = "long";
        return s;
    }

    static boolean tryParseShort(String value) {
        try {
            Short.parseShort(value.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean tryParseByte(String value) {
        try {
            Byte.parseByte(value.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
