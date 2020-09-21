package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        if (checkForByte(input))
            return "byte";
        if (checkForShort(input))
            return "short";
        if (checkForInt(input))
            return "int";
        if (checkForLong(input))
            return "long";
        return "Unknown type";
    }

    private static boolean checkForByte(String input) {
        try {
            Byte.parseByte(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean checkForInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean checkForShort(String input) {
        try {
            Short.parseShort(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean checkForLong(String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот таk
        String result = solution("12345");
        System.out.println(result);

    }

}
