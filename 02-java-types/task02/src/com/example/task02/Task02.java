package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        String type = "int";
        long typeInput = Long.parseLong(input);
        if (typeInput >= -128 && typeInput <= 127) {
            type = "byte";
        } else if (typeInput >= -32768 && typeInput <= 32767) {
            type = "short";
        } else if (typeInput >= -Math.pow(2, 31) && typeInput <= Math.pow(2, 31) - 1) {
            type = "int";
        } else if (typeInput >= -Math.pow(2, 63) && typeInput <= Math.pow(2, 63) - 1) {
            type = "long";
        }
        return type;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
