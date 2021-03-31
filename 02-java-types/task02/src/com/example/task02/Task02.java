package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        try {
            byte b = Byte.parseByte(input);
            return "Byte";
        } catch (Exception e0) {
            try {
                short b = Short.parseShort(input);
                return "Short";
            } catch (Exception e) {
                try {
                    int b = Integer.parseInt(input);
                    return "int";
                } catch (Exception e2) {
                    try {
                        long b = Long.parseLong(input);
                        return "Long";
                    } catch (Exception e3) {
                        return "String";
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
    }

}
