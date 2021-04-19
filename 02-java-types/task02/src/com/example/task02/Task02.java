package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            byte b = Byte.parseByte(input);
            return "byte";
        } catch (Exception e0) {
            try {
                short b = Short.parseShort(input);
                return "short";
            } catch (Exception e) {
                try {
                    int b = Integer.parseInt(input);
                    return "int";
                } catch (Exception e2) {
                    try {
                        long b = Long.parseLong(input);
                        return "long";
                    } catch (Exception e3) {
                        return "String";
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
