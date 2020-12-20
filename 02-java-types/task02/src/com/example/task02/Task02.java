package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return "";
        long l = Long.valueOf(input);
        if (val <= Byte.MAX_VALUE && val >= Byte.MIN_VALUE) {
            return "byte";
        } else if (val <= Short.MAX_VALUE && val >= Short.MIN_VALUE) {
            return "short";
        } else if (val <= Integer.MAX_VALUE && val >= Integer.MIN_VALUE) {
            return "int";
        } else return "long";
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
